package java_shopping;

import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<Carthem<? extends Product>> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public <T extends Product> void addItem(T product, int quantity) {
        items.add(new Carthem<>(product, quantity));
    }
    
    @Override
    public String toString() {
        return "쇼핑카드 목록 : " + items;
        
    }

    public void removeItem(Carthem<? extends Product> item) {
        items.remove(item);
    }

    public ArrayList<Carthem<? extends Product>> getItems() {
        return items;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Carthem<? extends Product> item : items) {
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }


}