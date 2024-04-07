class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;
    private int speed;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.speed = 0;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
    public void startEngin(){
        System.out.println("starting the engine");
        this.engine = true;
    }

    public void accelerate(int speed){
        System.out.println("Accelerating");
        this.speed += speed;
    }

    public void brake(){
        System.out.println("breaking");
        this.speed = 0;
    }
}

class Toyota extends Car{
    private String model;
    private int year;

    public Toyota(int cylinders, String name, String model, int year) {
        super(cylinders, name);
        this.model = model;
        this.year = year;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Toyota is speeding");
        super.accelerate(speed + 20);
    }
}
class Ford extends Car{
    private String model;
    private int year;

    public Ford(int cylinders, String name, String model, int year) {
        super(cylinders, name);
        this.model = model;
        this.year = year;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("FOrd is speeding");
        super.accelerate(speed + 20);
    }
}





public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, "Omma");
        System.out.println(car1.isEngine());
        Toyota car2 = new Toyota(4, "Aylia", "Sienna", 2022);
        car2.accelerate(40);

    }
}
