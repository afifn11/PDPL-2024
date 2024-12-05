import java.util.ArrayList;
import java.util.List;

class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing item) {
        items.add(item);
    }

    public void showItems() {
        for (Packing item : items) {
            System.out.println("CD name: " + item.pack());
        }
    }
}
