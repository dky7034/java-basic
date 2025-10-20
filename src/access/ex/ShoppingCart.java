package access.ex;

import java.util.Arrays;

public class ShoppingCart {
    // 필드
    private Item[] items = new Item[10];
    private int itemCount;

    // 생성자
    public ShoppingCart() {}

    // 메서드
    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) { // iter이 아닌 일반 for 반복문을 사용해, 실제 데이터가 존재하는 배열까지만 순회함
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
