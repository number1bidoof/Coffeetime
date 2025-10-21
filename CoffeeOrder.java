public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    // - size (String)
    // - type (String)
    // - orderID (String, make this one private)
    String size;
    String type;
    private int orderID;

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders;

    // TODO 4: Create a no-arg constructor
    // Set size to "medium" and type to "black"
    // Increment totalOrders
    CoffeeOrder(){
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    // Set type to "black" by default
    // Increment totalOrders
    CoffeeOrder(String size){
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    // Increment totalOrders
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
