package D02AbstractFactory.factory.impl;

import D02AbstractFactory.factory.GUIFactory;
import D02AbstractFactory.pojo.Button;
import D02AbstractFactory.pojo.Checkbox;
import D02AbstractFactory.pojo.WinButton;
import D02AbstractFactory.pojo.WinCheckbox;

/**
 * @author zhyao
 * @date 2023/1/15 2:21
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
