// Abstract Product class
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void describe();

    // Getters and setters for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Food class extending Product
class Food extends Product {
    private int calories;

    public Food(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public void describe() {
        System.out.println("Food: " + getName() + ", Price: $" + getPrice() + ", Calories: " + calories);
    }

    // Additional methods specific to Food
    public void eat() {
        System.out.println("Eating " + getName());
    }
}

// Drink class extending Product
class Drink extends Product {
    private String flavor;

    public Drink(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    public void describe() {
        System.out.println("Drink: " + getName() + ", Price: $" + getPrice() + ", Flavor: " + flavor);
    }

    // Additional methods specific to Drink
    public void sip() {
        System.out.println("Sipping " + getName());
    }
}

// ProductManager class with factory methods
class ProductManager {
    public static Food createFood(String name, double price, int calories) {
        return new Food(name, price, calories);
    }

    public static Drink createDrink(String name, double price, String flavor) {
        return new Drink(name, price, flavor);
    }
}

// Shop class that uses the ProductManager factory methods
class Q12_Aks {
    public static void main(String[] args) {
        // Create Food and Drink using factory methods
        Food food1 = ProductManager.createFood("Pizza", 10.99, 800);
        Drink drink1 = ProductManager.createDrink("Cola", 2.99, "Cola Flavor");

        // Describe and perform actions specific to Food and Drink
        food1.describe();
        food1.eat();
        drink1.describe();
        drink1.sip();
    }
}
