
import java.util.Scanner;

class FoodItem {

    String name, expDate, org;
    int qty;

    void foodDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Name:");
        name = in.nextLine();
        this.name = name;
        System.out.println("Expiration Date:");
        expDate = in.nextLine();
        this.expDate = expDate;
        System.out.println("Quantity:");
        qty = in.nextInt();
        this.qty = qty;
        String f = in.nextLine();
        System.out.println("Is it Organic:");
        org = in.nextLine();
        this.org = org;
    }

    public String Name() {
        return name;
    }

    public String Expdate() {
        return expDate;
    }

    public int Quantity() {
        return qty;
    }

    void display() {
        System.out.println(name + " " + expDate + " " + qty + " " + org);
    }
}

class Grains extends FoodItem {

    String pro;

    void grainDetails() {
        Scanner in = new Scanner(System.in);
        this.foodDetails();
        System.out.println("Is it Processed");
        pro = in.nextLine();
        this.pro = pro;
    }

    public String isProcessed() {
        return pro;
    }

    void printDetails() {
        this.display();
        System.out.print(pro);
    }
}

class Produce extends FoodItem {

    String fruit;

    void produceDetails() {
        Scanner in = new Scanner(System.in);
        this.foodDetails();
        System.out.println("Is it a fruit");
        fruit = in.nextLine();
        this.fruit = fruit;
    }

    public String getisfruit() {
        return fruit;
    }

    void printDetails() {
        this.display();
        System.out.print(fruit);
    }
}

class Dairy extends FoodItem {

    String nonefat, vegan;

    void dairyDetails() {
        Scanner in = new Scanner(System.in);
        this.foodDetails();
        System.out.println("Is it Nonefat");
        nonefat = in.nextLine();
        this.nonefat = nonefat;
        System.out.println("Is it Vegan");
        vegan = in.nextLine();
        this.vegan = vegan;
    }

    public String Nonefat() {
        return nonefat;
    }

    public String Vegan() {
        return vegan;
    }

    void printDetails() {
        this.display();
        System.out.print(nonefat + " " + vegan);
    }
}
