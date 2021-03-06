package MilitaryElite.Models;

import MilitaryElite.Interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(String id, String firstName, String lastName,double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }


    @Override
    public double getSalary() {
        return this.salary;
    }
}
