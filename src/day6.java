public class day6 {
    static class car {
        String color;
        String brand;
        int speed;
        int fuel;

        car() {
            System.out.println("Constructor called");
        }

        car(String color, String brand, int speed, int fuel) {
            this.color = color;
            this.brand = brand;
            this.speed = speed;
            this.fuel = fuel;
        }

        void printDetails() {
            System.out.println("Color:" + color);
            System.out.println("Brand:" + brand);
            System.out.println("Speed:" + speed);
            System.out.println("Fuel:" + fuel);
        }
    }

    public static void main(String[] args) {
        car car1 = new car("white", "bmw", 500, 300);
        car1.printDetails();
    }
}