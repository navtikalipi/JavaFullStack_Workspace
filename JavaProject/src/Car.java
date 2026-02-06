public class Car {
    String colour;
    String model;
    int chassisNo;
    double price;


    public Car(){ //default constructor

    }

    public Car(String colour1){ // parameterized constructor
        this.colour=colour1; //this is optional when using with diff variable name, it is used to access different variable name
    }
    public void displayDetails(){
        System.out.println("This model is: "+this.model+", the price is: " +this.price+" and chassis number is: "+this.chassisNo);
    }
}
