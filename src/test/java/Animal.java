import org.apache.log4j.Logger;

import java.util.List;

/**
 * @author zhyao
 * @date 2022/6/9 18:54
 */
public interface Animal {
    Logger logger = Logger.getLogger(Animal.class);

    void sound();

    String getFood();

    String getId();
}
