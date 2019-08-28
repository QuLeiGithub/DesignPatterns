package iterator;

import iterator.pojo.MenuItem;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat.", true, 2.99);
        addItem("BLT", "DSHJGDSJ", false, 2.99);
        addItem("SSASA", "DDSSDSDS", false, 3.29);
        addItem("SDSDDS", "DSDDSDEW", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

}
