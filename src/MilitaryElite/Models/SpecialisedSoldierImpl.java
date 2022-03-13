package MilitaryElite.Models;

import MilitaryElite.enums.Corps;

public class SpecialisedSoldierImpl extends SoldierImpl{
    private Corps corps;


    public SpecialisedSoldierImpl(String id, String firstName, String lastName, Corps corps) {
        super(id, firstName, lastName);
        this.corps = corps;
    }

    public Corps getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return "SpecialisedSoldierImpl{" +
                "corps=" + getCorps().name() +
                '}';
    }
}
