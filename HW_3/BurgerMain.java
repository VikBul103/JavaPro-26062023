package HW_3;

public class BurgerMain {
    public static void main(String[] args) {
        Burger normalBurger = new Burger("Bun", "Beef", "Cheese", "Salad", "Mayonnaise");

        Burger dietBurger = new Burger("Bun", "Chicken", "Cheese", "Salad");

        Burger doubleMeatBurger = new Burger("Bun", "Beef", "Cheese", "Salad", "Mayonnaise",true);
    }
}
