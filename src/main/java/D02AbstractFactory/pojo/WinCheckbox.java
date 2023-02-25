package D02AbstractFactory.pojo;

/**
 * @author zhyao
 * @date 2023/1/15 2:27
 */
public class WinCheckbox extends Checkbox{
    @Override
    public void click() {
        isCheck = !isCheck;
        System.out.println("winCheckbox click! now isCheck= " + isCheck);
    }
}
