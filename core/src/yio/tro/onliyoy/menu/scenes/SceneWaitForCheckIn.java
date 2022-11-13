package yio.tro.onliyoy.menu.scenes;

import yio.tro.onliyoy.menu.elements.BackgroundYio;

public class SceneWaitForCheckIn extends AbstractNetWaitScene{

    @Override
    public BackgroundYio getBackgroundValue() {
        return BackgroundYio.magenta;
    }


    @Override
    protected String getKey() {
        return "creating_account";
    }
}
