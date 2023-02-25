package D02AbstractFactory.factory.impl;

import D02AbstractFactory.factory.GUIFactory;
import D02AbstractFactory.pojo.*;

/**
 * @author zhyao
 * @date 2023/1/15 2:21
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
