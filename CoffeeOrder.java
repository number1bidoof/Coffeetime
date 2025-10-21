/**
 * Ayah Abdalla
 * Course: Java I
 * Date: 10/21/2025
 *
 * Classes lab, building a class that tracks coffee orders
 */

public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    String size;
    String type;
    private int orderID;

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders;

    // TODO 4: Create a no-arg constructor
    CoffeeOrder(){
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    CoffeeOrder(String size){
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    CoffeeOrder(String size, String type){
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    public void describeOrder(){
        System.out.println("The type is... " + this.type);
        System.out.println("The size is... " + this.size);
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static void getTotalOrders(){System.out.println(totalOrders);}
}
