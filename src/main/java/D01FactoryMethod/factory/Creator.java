package D01FactoryMethod.factory;

import D01FactoryMethod.pojo.Product;

/**
 * @author zhyao
 * @date 2023/1/7 2:57
 */
public interface Creator {

    void someOperation();

    Product createProduct();

}
