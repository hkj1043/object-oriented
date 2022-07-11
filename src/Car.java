class Car {
    String model = "tesla";
    String color = "white";
    int doors = 4;

    void power(){
        System.out.println("시동");
    }
    void accelerate(){
        System.out.println("가속");
    }
    void stop(){
        System.out.println("정지");
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.doors);
        car.power();
        car.accelerate();
        car.stop();
    }
}