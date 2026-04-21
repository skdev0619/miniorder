package com.sparta.miniorder.order.dto;

import com.sparta.miniorder.order.entity.Order;
import com.sparta.miniorder.product.entity.Product;
import lombok.Getter;

@Getter
public class OrderResponse {

    private Long orderId;
    private Product product;

    public OrderResponse(Order order) {
        this.orderId = order.getId();
        this.product = order.getProduct();
    }
}