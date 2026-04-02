interface Vehicle {

    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle {

    int speed = 0;
    int gear = 1;

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed);
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bicycle speed decreased to: " + speed);
    }
}

class Bike implements Vehicle {

    int speed = 0;
    int gear = 1;

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bike gear changed to: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed);
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bike speed decreased to: " + speed);
    }
}

class Car implements Vehicle {

    int speed = 0;
    int gear = 1;

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Car gear changed to: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to: " + speed);
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Car speed decreased to: " + speed);
    }
}

public class exp6 {

    public static void main(String[] args) {

        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        // Bicycle operations
        bicycle.changeGear(2);
        bicycle.speedUp(10);
        bicycle.applyBrakes(3);

        // Bike operations
        bike.changeGear(3);
        bike.speedUp(30);
        bike.applyBrakes(10);

        // Car operations
        car.changeGear(4);
        car.speedUp(60);
        car.applyBrakes(20);
    }
}