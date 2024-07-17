package java_shopping;


public class ShoppingMall {
	
    public static void main(String[] args) {
    	
        Electronics elec = new Electronics("E001", "전자제품", 1500, "BrandA");
        Clothing clo = new Clothing("C001", "의류 - 티셔츠", 20, "M");

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(elec, 1);
        cart.addItem(clo, 2);

        System.out.println(cart);

        System.out.println("Total Price: " + cart.getTotalPrice() + " units");
    }
}