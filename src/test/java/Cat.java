/**
 * @author zhyao
 * @date 2022/6/11 16:00
 */
public class Cat implements Animal{

    private final String voice = "喵喵叫";
    private final String food = "喵粮";

    private String id;
    private String name;

    public Cat(String id) {
        this.id = id;
    }

    public Cat(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void sound() {
        logger.info(id + voice);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public String getVoice() {
        return voice;
    }
}
