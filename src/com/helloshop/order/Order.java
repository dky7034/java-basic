package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    // 필드
    User user;
    Product product;

    // 생성자
    public Order() {}
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    // 메서드
}
