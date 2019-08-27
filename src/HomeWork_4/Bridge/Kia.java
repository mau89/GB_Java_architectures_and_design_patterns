package HomeWork_4.Bridge;

public class Kia extends CarModel {
    public Kia(BodyType bodyType) {
        super(bodyType);
    }

    @Override
    void Details() {
        bodyType.setBodyType();
    }
}
