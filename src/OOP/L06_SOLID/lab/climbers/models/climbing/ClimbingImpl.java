package climbers.models.climbing;

import java.util.Collection;

import climbers.models.climber.Climber;
import climbers.models.mountain.Mountain;

public class ClimbingImpl implements Climbing {

    @Override
    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers) {
        Collection<String> peaksList = mountain.getPeaksList();

        //•	Climbers cannot climb peaks if their strength is equal to or below 0.
        //•	They start climbing and conquering peaks, one by one.
        //•	If they conquer a peak, they add it to their roster of conquered peaks and their strength is decreased.
        //•	The conquered peak should then be removed from the peaks list of the current mountain.
        //•	Climbers cannot continue climbing if their strength drops to 0.
        //o	If their strength drops to 0, the next climber starts climbing.

        for (Climber climber : climbers) {

            while (climber.canClimb() && peaksList.iterator().hasNext()) {
                climber.climb();
                String peak = peaksList.iterator().next();
                climber.getRoster().getPeaks().add(peak);
                peaksList.remove(peak);
            }
        }
    }
}
