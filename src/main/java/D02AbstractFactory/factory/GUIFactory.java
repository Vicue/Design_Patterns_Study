package D02AbstractFactory.factory;

import D02AbstractFactory.pojo.Button;
import D02AbstractFactory.pojo.Checkbox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhyao
 * @date 2023/1/15 2:20
 */
public interface GUIFactory {

    public Button createButton();

    public Checkbox createCheckbox();
}
