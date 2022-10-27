package GroupProject;
  /* Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which
    should be returning a price of the car. Create 2 sub classes: Sedan and Truck. The Truck class has a field as
    weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as
    following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5% discount, otherwise 10% discount
    */

class Car{
    int carPrice;
    String color;

    Car(int carPrice){
        this.carPrice=carPrice;
    }
    double calculateSalePrice(){
        int priceOfTheCar=carPrice;
        return priceOfTheCar;
    }
}
class Truck extends Car {

    double weight;

    Truck(int carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }

    double calculateSalePrice() {
        double priceOfTheCar;
        if (weight > 2000) {
            priceOfTheCar = super.calculateSalePrice()*0.9;
        } else {
            priceOfTheCar = super.calculateSalePrice()*0.8;
        }
        return priceOfTheCar;
    }}
class Sedan extends Car {

    double length;

    Sedan(double carPrice, double length) {
        super((int) carPrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return 0.95 * carPrice;
        } else {
            return 0.90 * carPrice;
        }
    }
}
public class Task2 {
    public static void
    main(String[] args) {
        Truck truck = new Truck(1280, 120);
        System.out.println("Truck price is " + truck.calculateSalePrice());

        Sedan sedan = new Sedan(2560, 20);
        System.out.println("Truck price is " + sedan.calculateSalePrice());
    }
}