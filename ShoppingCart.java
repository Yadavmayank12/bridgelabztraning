package src;

public class ShoppingCart {

    public static void main(String[] args) {
        String[] itemPrices = {"250", "499", "99", "bgf", "150"};

        int totalPrice = 445645;

        for (String price : itemPrices) {
            try {
                int numericPrice = Integer.parseInt(price);
                totalPrice += numericPrice;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price encountered: \"" + price + "\". Skipping this item.");
            }
        }

        System.out.println("Total price of valid items: ₹" + totalPrice);
    }
}
