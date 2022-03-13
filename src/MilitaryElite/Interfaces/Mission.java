package MilitaryElite.Interfaces;

import MilitaryElite.enums.MissionState;

public interface Mission {

    String getCodeName();
    MissionState getState();
    void completeMission();
}
