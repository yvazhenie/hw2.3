public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stels", 2);
        Bicycle bicycleSecond = new Bicycle("Navigator", 3);
        Car car = new Car("Camry", 4);
        Truck truck = new Truck("Man", 8);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        System.out.println("Велосипед");
        serviceStation.check(car);
        System.out.println("Легковая");
        serviceStation.check(truck);
        System.out.println("Грузовик");
        serviceStation.check(bicycleSecond);
        System.out.println("Второй велосипед");
    }
}