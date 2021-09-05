package sycho.java.pattern.prototype;

import java.util.List;
import java.util.stream.IntStream;

public class CarClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.listAll();

        Car car2 = (Car) car.clone();
        Car car3 = (Car) car.clone();

        List<String> car2List = car2.getCarList();
        List<String> car3List = car3.getCarList();

        car2List.add("mini car");
        car3List.remove("truck");

        System.out.println(car.getCarList());
        System.out.println(car2List);
        System.out.println(car3List);

    }
}
