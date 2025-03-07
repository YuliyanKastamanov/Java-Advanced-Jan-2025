package climbers.models.climbing;

import java.util.Collection;

import climbers.models.climber.Climber;
import climbers.models.mountain.Mountain;

public class ClimbingImpl implements Climbing {

    @Override
    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers) {
        Collection<String> peaksList = mountain.getPeaksList();


        for (Climber climber : climbers) {

            // TODO remove the peak when is conquered
            // TODO use iterator
                for (String peak : mountain.getPeaksList()) {
                    if (climber.canClimb()){
                        climber.climb();
                        climber.getRoster().getPeaks().add(peak);
                    }else {
                        break;
                    }
                }

        }
    }

}
