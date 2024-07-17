package java_shopping;

class Carthem<T extends Product> {
    private T product;
    private int quantity;

    public Carthem(T product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Carthem [product=" + product + ", quantity=" + quantity + "]";
    }
}