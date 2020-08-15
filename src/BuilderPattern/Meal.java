package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items = new ArrayList<>();

    public void itemAdd(Item item){
        items.add(item);
    }

    public Float getCost() {
        float total = 0f;
        for (Item item : items) {
             total += item.price();
        }
        return total;
    }

    public void showMeal() {
        for (Item item : items) {
           System.out.println("name:"+item.name());
           System.out.println("packing:"+item.packing().packing());
        }
        System.out.println("价格为；"+getCost());
    }
}
