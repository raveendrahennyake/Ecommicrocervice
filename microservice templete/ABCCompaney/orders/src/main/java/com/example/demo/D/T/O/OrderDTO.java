package com.example.demo.D.T.O;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderDTO {
    private int id;
    private int itemId;
    private String orderDate;
    private int amount;
}
