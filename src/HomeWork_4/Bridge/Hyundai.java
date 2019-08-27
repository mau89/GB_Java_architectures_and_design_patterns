package HomeWork_4.Bridge;

class Hyundai extends CarModel {
    Hyundai(BodyType bodyType) {
        super(bodyType);
    }

    @Override
    void Details() {
        System.out.println("Hyundai");
        bodyType.setBodyType();
    }
}
