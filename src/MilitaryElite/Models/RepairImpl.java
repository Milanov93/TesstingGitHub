package MilitaryElite.Models;

import MilitaryElite.Interfaces.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private String hoursWorked;

    public RepairImpl(String partName, String hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public String getHoursWorked() {
        return this.hoursWorked;
    }
}
