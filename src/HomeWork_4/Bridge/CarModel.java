package HomeWork_4.Bridge;

abstract class CarModel {
    BodyType bodyType;

    CarModel(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    abstract void Details();
}
