package D01FactoryMethod.pojo;

/**
 * @author zhyao
 * @date 2023/1/7 2:54
 */
public class Concrete implements Product{

    private String name;

    public Concrete() {

    }

    public Concrete(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doStuff() {
        System.out.println("Concrete do stuff: " + name);
    }
}
