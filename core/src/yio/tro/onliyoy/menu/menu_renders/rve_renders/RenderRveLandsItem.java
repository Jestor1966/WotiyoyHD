package yio.tro.onliyoy.menu.menu_renders.rve_renders;

import yio.tro.onliyoy.menu.elements.resizable_element.AbstractRveConditionItem;
import yio.tro.onliyoy.menu.elements.resizable_element.AbstractRveItem;
import yio.tro.onliyoy.stuff.GraphicsYio;

public class RenderRveLandsItem extends AbstractRveClickableRender{

    @Override
    public void renderItem(AbstractRveItem rveItem, double alpha) {
        renderTitle((AbstractRveConditionItem) rveItem, alpha);
        renderIcons((AbstractRveConditionItem) rveItem, alpha);
        renderSelection((AbstractRveConditionItem) rveItem, alpha);
    }
}
