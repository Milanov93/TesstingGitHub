package MilitaryElite.Models;

import MilitaryElite.Interfaces.Commando;
import MilitaryElite.Interfaces.Mission;
import MilitaryElite.Interfaces.Soldier;
import MilitaryElite.enums.Corps;

import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<Mission> missions;

    public CommandoImpl(String id, String firstName, String lastName, Corps corps, Set<Mission> missions) {
        super(id, firstName, lastName, corps);
        this.missions = missions;
    }

    @Override
    public Set<Mission> getMission() {
        return this.missions;
    }
}
