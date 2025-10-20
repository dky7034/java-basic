package access.ex;

public class Item {
    // 필드
    private String name;
    private int price;
    private int quantity;

    // 생성자
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 메서드
    // getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getTotalPrice() {
        return price * quantity;
    }
}
