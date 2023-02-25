package D01FactoryMethod;

import D01FactoryMethod.factory.ConcreteCreatorA;
import D01FactoryMethod.factory.ConcreteCreatorB;
import D01FactoryMethod.factory.Creator;
import D01FactoryMethod.pojo.Product;

/**
 * 工厂模式
 * @author zhyao
 * @date 2022/6/4 1:17
 */
public class Main {
    public static void main(String[] args) {
        Creator creatorFactoryA = new ConcreteCreatorA();
        Product productA= creatorFactoryA.createProduct();
        productA.doStuff();
        Creator creatorFactoryB = new ConcreteCreatorB();
        Product productB = creatorFactoryB.createProduct();
        productB.doStuff();
    }
}
