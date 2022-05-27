class FirstCar {
    public int speed;
    public int gear;

    public FirstCar(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applybrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String convertString() {
        return ("Gears are " + gear + "\n" + speed + "is" + "\n");
    }
}

class Accord extends FirstCar {
    public int prize;

    Accord(int gear, int speed, int highprize) {
        super(gear, speed);
        prize = highprize;
    }

    @Override
    public String convertString() {
        return (super.convertString() + "car parize is " + prize);
    }

}

class Inheritance {
    public static void main(String[] args) {
        Accord cars = new Accord(2, 80, 40000);
        System.out.println(cars.convertString());

    }
}