package patronesDisenio.estructural.composite;

public class Application
{
    public static void main(String[] args) {
        Product charger = new Product("Charger", 130.56);
        Product headphones = new Product("Headphones", 495.75);
        Product phone = new Product("Phone", 9527.30);

        Box chargerBox = new Box();
        chargerBox.add(charger);

        Box phoneBox = new Box();
        phoneBox.add(phone);
        phoneBox.add(headphones);

        Box phoneSet = new Box();
        phoneSet.add(phoneBox);
        phoneSet.add(chargerBox);

        Product book = new Product("Hamlet", 789.46);

        Box bookBox = new Box();
        bookBox.add(book);

        Product giftCard = new Product("Gift card", 1500);

        Box wholePackage = new Box();
        wholePackage.add(bookBox);
        wholePackage.add(phoneSet);
        wholePackage.add(giftCard);

        System.out.println("Total price: " + wholePackage.getPrice());
    }
}
