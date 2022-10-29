package com.example.CSCU_ClothesStore.Service;

import com.example.CSCU_ClothesStore.Entity.Order;
import com.example.CSCU_ClothesStore.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo OrderRepo;

    public Order insertOrder(Order Order) {
        return OrderRepo.save(Order);
    }
}
