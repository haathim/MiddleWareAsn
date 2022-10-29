package com.example.CSCU_ClothesStore.Controller;

import com.example.CSCU_ClothesStore.Entity.Order;
import com.example.CSCU_ClothesStore.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/Order")
public class OrderController {
    @Autowired
    private OrderService OrderService;

    @PostMapping("/add")
    public Order insertOrder(@RequestBody Order Order, HttpServletRequest httpServletRequest){
        return OrderService.insertOrder(Order);
    }
}
