package HW_3;

public class Burger {
    private String bread;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bread, String meat, String cheese, String greens, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        displayStaff();
    }

    public Burger(String bread, String meat, String cheese, String greens) {
        this(bread, meat, cheese, greens, "No mayonnaise");
    }

    public Burger(String bread, String meat, String cheese, String greens, String mayonnaise, boolean doubleMeat) {
        this(bread, doubleMeat ? meat + ", " + meat : meat, cheese, greens, mayonnaise);
    }

    private void displayStaff() {
        System.out.println("Bread: " + bread);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
        System.out.println("Mayonnaise: " + mayonnaise);
        System.out.println();
    }
}
