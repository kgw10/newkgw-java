package java_shopping;

class Electronics extends Product {
    private String brand;

    public Electronics(String id, String name, int price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "전자제품 브렌드 : " + brand + ", " + super.toString();
    }
}
