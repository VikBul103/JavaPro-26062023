package HW_3;

public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Burger:");
        Burger normalBurger = new Burger("Bun", "Beef", "Cheese", "Salad", "Mayonnaise");

        System.out.println("Diet burger:");
        Burger dietBurger = new Burger("Bun", "Chicken", "Cheese", "Salad");

        System.out.println("Double meat burger");
        Burger doubleMeatBurger = new Burger("Bun", "Beef", "Cheese", "Salad", "Mayonnaise",true);
    }
}
