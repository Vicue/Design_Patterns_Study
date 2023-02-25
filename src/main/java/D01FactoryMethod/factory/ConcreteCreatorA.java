package D01FactoryMethod.factory;

import D01FactoryMethod.pojo.Concrete;
import D01FactoryMethod.pojo.Product;

/**
 * @author zhyao
 * @date 2023/1/7 2:58
 */
public class ConcreteCreatorA implements Creator{

    @Override
    public void someOperation() {
        System.out.println("ConcreteCreatorA Operation");
    }

    @Override
    public Product createProduct() {
        return new Concrete("concrete A");
    }
}
