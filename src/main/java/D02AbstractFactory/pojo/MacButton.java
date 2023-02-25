package D02AbstractFactory.pojo;

/**
 * @author zhyao
 * @date 2023/1/15 2:26
 */
public class MacButton extends Button{

    @Override
    public void click() {
        System.out.println("MacButton clicked!");
    }
}
