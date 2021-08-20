package com.tsu.mag.webspringbootapp.database.repository;

import com.tsu.mag.webspringbootapp.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
