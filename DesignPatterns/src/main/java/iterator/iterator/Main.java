package iterator.iterator;

public class Main {
    public static void main(String[] args) {
        DinerMenuIterator dinerMenuIterator = new DinerMenuIterator();
        PancakeHouseIterator pancakeHouseIterator = new PancakeHouseIterator();
        Waitress waitress = new Waitress(dinerMenuIterator, pancakeHouseIterator);
        waitress.printMenu();
    }
}
