package ToString;

public class Car {
    String name;
    String colour;

    Car(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override

    public String toString(){
        return "This car is " + this.name + " and " + this.colour ;
    }


}
