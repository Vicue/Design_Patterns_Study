import org.junit.Test;
import org.apache.log4j.Logger;
/**
 * @author zhyao
 * @date 2022/6/9 18:57
 */

public class TestSample {
    final static Logger logger = Logger.getLogger(TestSample.class);

    @Test
    public void test01() {
        Animal cat = new Cat("001");
        feed(cat);
    }

    public void feed(Animal animal) {
        logger.info("投喂" + animal.getId() + ": " + animal.getFood());
    }

}
