package HomeWork_4.Bridge;

public class Bridge {
    public static void main(String[] args) {
        CarModel carModel;
        carModel = new Hyundai(new Coupe());
        carModel.Details();
    }
}
