package yio.tro.onliyoy.menu.scenes;

import yio.tro.onliyoy.menu.elements.BackgroundYio;
import yio.tro.onliyoy.menu.elements.multi_button.TemporaryMbeItem;

public class SceneReportPauseMenu extends AbstractPauseMenu{

    @Override
    public BackgroundYio getBackgroundValue() {
        return BackgroundYio.magenta;
    }


    @Override
    protected TemporaryMbeItem[] getMbeItems() {
        return new TemporaryMbeItem[]{
                new TemporaryMbeItem("resume", BackgroundYio.green, getResumeReaction()),
                new TemporaryMbeItem("main_lobby", BackgroundYio.red, getOpenSceneReaction(Scenes.moderator)),
        };
    }
}
