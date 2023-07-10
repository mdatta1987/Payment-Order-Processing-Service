package com.upgrad.orderprocessingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
    private String orderId;
    private String orderStatus;
    private Double orderAmount;

}
