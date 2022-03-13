package MilitaryElite.Models;

import MilitaryElite.Interfaces.LieutenantGeneral;
import MilitaryElite.Interfaces.Private;

import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements Private , LieutenantGeneral {
    private Set<Private> privates;

    public LieutenantGeneralImpl(String id, String firstName, String lastName, double salary,Set<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }


    @Override
    public Set<Private> getPrivates() {
        return privates;
    }


}
