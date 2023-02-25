package D02AbstractFactory.pojo;

/**
 * @author zhyao
 * @date 2023/1/15 2:20
 */
public abstract class Checkbox {

    protected String name;

    protected boolean isCheck = false;

    public abstract void click();
}
