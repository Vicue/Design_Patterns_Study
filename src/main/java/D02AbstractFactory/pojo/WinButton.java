package D02AbstractFactory.pojo;

/**
 * @author zhyao
 * @date 2023/1/15 2:25
 */
public class WinButton extends Button{
    @Override
    public void click() {
        System.out.println("winButton clicked!");
    }
}
