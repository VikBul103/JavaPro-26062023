package HW_9;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> fruitsToAdd) {
        fruits.addAll(fruitsToAdd);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        Fruit firstFruit = fruits.get(0);
        if (firstFruit instanceof Apple) {
            return fruits.size();
        } else if (firstFruit instanceof Orange) {
            return fruits.size() * 1.5f;
        }
        return 0.0f;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001f;
    }

    public void merge(Box<T> otherBox) {
        if (this.getClass().equals(otherBox.getClass())) {
            this.fruits.addAll(otherBox.fruits);
            otherBox.fruits.clear();
        }
    }
}
