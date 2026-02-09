public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        
        c.displayDetails(); //the obj is req since it is not static. If static keyword used- this keyword is not required as it becomes class property
    }
}
