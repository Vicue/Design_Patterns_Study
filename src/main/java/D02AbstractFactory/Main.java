package D02AbstractFactory;

import D02AbstractFactory.factory.GUIFactory;
import D02AbstractFactory.factory.impl.MacFactory;
import D02AbstractFactory.factory.impl.WinFactory;
import D02AbstractFactory.pojo.Button;
import D02AbstractFactory.pojo.Checkbox;
import D02AbstractFactory.pojo.SystemType;

/**
 * 抽象工厂模式
 * @author zhyao
 * @date 2022/6/4 1:19
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();


        GUIFactory winFty = main.getFactory(SystemType.WINDOWS);
        Button winBtn = winFty.createButton();
        winBtn.click();
        Checkbox winChb = winFty.createCheckbox();
        winChb.click();

        GUIFactory macFty = main.getFactory(SystemType.MAC);
        Button macBtn = macFty.createButton();
        macBtn.click();
        Checkbox macChb = macFty.createCheckbox();
        macChb.click();
        macChb.click();

    }

    public GUIFactory getFactory(SystemType type) {
        return switch (type) {
            case WINDOWS -> new WinFactory();
            case MAC -> new MacFactory();
        };
    }
}
