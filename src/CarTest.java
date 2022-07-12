public class CarTest {
    public static void main(String[] args) {
        Car tesla = new Car();
        Car audi = new Car();
        Car bmw = new Car();
        tesla.model = "tesla";
        tesla.color = "blue";
        audi.model = "audi";
        audi.color = "black";
        bmw.model = "bmw";
        bmw.color = "white";

        System.out.println("1번 차는 "+tesla.model+"이고 색상은"+tesla.color+"색 입니다.");
        System.out.println("2번 차는 "+audi.model+"이고 색상은"+audi.color+"색 입니다.");
        System.out.println("3번 차는 "+bmw.model+"이고 색상은"+bmw.color+"색 입니다.");

        tesla.power();
        tesla.accelerate();
        tesla.stop();

        audi.power();
        audi.accelerate();
        audi.stop();

        bmw.power();
        bmw.accelerate();
        bmw.stop();
    }
}
class Car{
    public String model;
    public String color;
    void power(){System.out.println("시동");}
    void accelerate(){
        System.out.println("가속");
    }
    void stop(){
        System.out.println("정지");
    }
}
