package java_shopping;

class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, int price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "�� ������ : " + size + ", " + super.toString();
    }
}
