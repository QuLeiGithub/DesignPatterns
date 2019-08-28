package iterator.iterator;

import iterator.pojo.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator, Menu {
    private final int MAX_ITEMS = 6;
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator() {
        list = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat.", true, 2.99);
        addItem("BLT", "DSHJGDSJ", false, 2.99);
        addItem("SSASA", "DDSSDSDS", false, 3.29);
        addItem("SDSDDS", "DSDDSDEW", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (position >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu.");
        } else {
            list[position++] = menuItem;
        }

    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position++];
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next().");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }

    @Override
    public Iterator createIterator() {
        return this;
    }
}
