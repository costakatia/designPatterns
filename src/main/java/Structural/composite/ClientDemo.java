package Structural.composite;

public class ClientDemo {
    public static void main(String[] args) {
        GiftSurpriseBox gifBox = new GiftSurpriseBox();
        GiftSurpriseBox subGiftBox = new GiftSurpriseBox();

        Gift gift = new Gift("Toy car");
        Gift gift2 = new Gift("Toy Plane");

        gifBox.add(gift);
        subGiftBox.add(gift2);
        gifBox.add(subGiftBox);

        gifBox.unWrap();
    }
}
