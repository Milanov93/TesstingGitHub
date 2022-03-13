package MilitaryElite.Models;

import MilitaryElite.Interfaces.Engineer;
import MilitaryElite.Interfaces.Repair;
import MilitaryElite.enums.Corps;

import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    Set<Repair> repairs;

    public EngineerImpl(String id, String firstName, String lastName, Corps corps, Set<Repair> repairs) {
        super(id, firstName, lastName, corps);
        this.repairs = repairs;
    }

    @Override
    public Set<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        return "EngineerImpl{" +
                "repairs=" + this.repairs +
                '}';
    }
}
