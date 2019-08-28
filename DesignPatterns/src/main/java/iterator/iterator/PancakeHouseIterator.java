package iterator.iterator;

import iterator.pojo.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 早餐店
 *
 * @author QuLei
 */
public class PancakeHouseIterator implements Menu {
    ArrayList menuItems;

    public PancakeHouseIterator() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs,and toast",
                true, 2.99);
        addItem("Regular Pancakes", "Pancakes with fried eggs,sausage",
                false, 2.88);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);
        addItem("Waffles", "Waffles,with your choice of blueberries or strawberries",
                true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
