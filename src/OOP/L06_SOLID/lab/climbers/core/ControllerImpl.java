package climbers.core;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import climbers.models.climber.Climber;
import climbers.models.climber.RockClimber;
import climbers.models.climber.WallClimber;
import climbers.models.climbing.Climbing;
import climbers.models.climbing.ClimbingImpl;
import climbers.models.mountain.Mountain;
import climbers.models.mountain.MountainImpl;
import climbers.repositories.ClimberRepository;
import climbers.repositories.MountainRepository;
import climbers.repositories.Repository;

import static climbers.common.ConstantMessages.*;
import static climbers.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private Repository<Climber> climberRepository;
    private Repository<Mountain> mountainRepository;
    private Climbing climbing;

    public ControllerImpl() {
        this.climbing = new ClimbingImpl();
        climberRepository = new ClimberRepository();
        mountainRepository = new MountainRepository();
    }

    @Override
    public String addClimber(String type, String climberName) {

        Climber climber;
        switch (type) {
            case "RockClimber":
                climber = new RockClimber(climberName);
                break;
            case "WallClimber":
                climber = new WallClimber(climberName);
                break;
            default:
                throw new IllegalArgumentException(CLIMBER_INVALID_TYPE);
        }

        climberRepository.add(climber);

        return String.format(CLIMBER_ADDED, type, climberName);
    }

    @Override
    public String addMountain(String mountainName, String... peaks) {
        MountainImpl mountain = new MountainImpl(mountainName);
        for (String peak : peaks) {
            mountain.getPeaksList().add(peak);
        }

        mountainRepository.add(mountain);

        return String.format(MOUNTAIN_ADDED, mountainName);
    }

    @Override
    public String removeClimber(String climberName) {

        Climber climber = climberRepository.byName(climberName);

        if (null == climber) {
            throw new IllegalArgumentException(String.format(CLIMBER_DOES_NOT_EXIST, climberName));
        }

        climberRepository.remove(climber);

        return String.format(CLIMBER_REMOVE, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {

        Collection<Climber> climbers = climberRepository.getCollection();

        if (climbers.isEmpty()) {
            throw new IllegalArgumentException(THERE_ARE_NO_CLIMBERS);
        }

        Mountain mountain = mountainRepository.byName(mountainName);

        climbing.conqueringPeaks(mountain, climbers);

        int removedClimbers = climberRepository.getCollection().stream()
                                               .filter(climber -> !climber.canClimb())
                                               .collect(Collectors.toList()).size();

        return String.format(PEAK_CLIMBING, mountainName, removedClimbers);
    }

    @Override
    public String getStatistics() {
        Collection<Climber> climbers = climberRepository.getCollection();
        Collection<Mountain> mountains = mountainRepository.getCollection();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(FINAL_MOUNTAIN_COUNT, mountains.size()))
          .append(System.lineSeparator())
          .append(FINAL_CLIMBERS_STATISTICS);

        climbers.forEach(climber -> {
            sb.append(System.lineSeparator())
              .append(String.format(FINAL_CLIMBER_NAME, climber.getName()))
              .append(System.lineSeparator())
              .append(String.format(FINAL_CLIMBER_STRENGTH, climber.getStrength()))
              .append(System.lineSeparator());

            Collection<String> peaks = climber.getRoster().getPeaks();
            String conqueredPeaks = peaks.isEmpty() ? "None" :
                                    String.join(FINAL_CLIMBER_FINDINGS_DELIMITER, peaks);

            sb.append(String.format(FINAL_CLIMBER_PEAKS, conqueredPeaks));
        });

        return sb.toString();
    }
}
