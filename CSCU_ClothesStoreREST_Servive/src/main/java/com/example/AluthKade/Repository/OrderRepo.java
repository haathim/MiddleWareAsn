package com.example.CSCU_ClothesStore.Repository;

import com.example.CSCU_ClothesStore.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}
