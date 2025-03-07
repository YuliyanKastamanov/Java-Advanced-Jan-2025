package climbers.models.roster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RosterImpl implements Roster {

    private Collection<String> peaks;

    public RosterImpl() {
        this.peaks = new ArrayList<>();
    }

    @Override
    public Collection<String> getPeaks() {
        return this.peaks;
    }
}
