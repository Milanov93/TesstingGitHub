package MilitaryElite.Models;

import MilitaryElite.Interfaces.Mission;
import MilitaryElite.enums.MissionState;

public class MissionIml implements Mission {
    private String codeName;
    private MissionState missionState;

    public MissionIml(String codeName, MissionState missionState) {
        this.codeName = codeName;
        this.missionState = missionState;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public MissionState getState() {
        return this.getState();
    }

    @Override
    public void completeMission() {
    this.missionState = MissionState.finished;
    }

}
