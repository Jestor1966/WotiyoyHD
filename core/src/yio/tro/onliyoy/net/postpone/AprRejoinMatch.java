package yio.tro.onliyoy.net.postpone;

import yio.tro.onliyoy.game.loading.LoadingParameters;
import yio.tro.onliyoy.game.loading.LoadingType;
import yio.tro.onliyoy.menu.scenes.Scenes;
import yio.tro.onliyoy.net.shared.NetMatchBattleData;

public class AprRejoinMatch extends AbstractPostponedReaction{

    String battleDataCode;


    public AprRejoinMatch(PostponedReactionsManager postponedReactionsManager) {
        super(postponedReactionsManager);
    }


    @Override
    boolean isReady() {
        return !areNetWaitScenesMovingCurrently();
    }


    @Override
    void apply() {
        NetMatchBattleData netMatchBattleData = new NetMatchBattleData();
        netMatchBattleData.decode(battleDataCode);
        if (netMatchBattleData.levelSize == null) {
            // something bad happened
            Scenes.mainLobby.create();
            return;
        }
        LoadingParameters loadingParameters = new LoadingParameters();
        loadingParameters.add("level_size", "" + netMatchBattleData.levelSize);
        loadingParameters.add("level_code", netMatchBattleData.levelCode);
        loadingParameters.add("battle_data", battleDataCode);
        yioGdxGame.loadingManager.startInstantly(LoadingType.net_match, loadingParameters);
    }


    public void setBattleDataCode(String battleDataCode) {
        this.battleDataCode = battleDataCode;
    }
}
