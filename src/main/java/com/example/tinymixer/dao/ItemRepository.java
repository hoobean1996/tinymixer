package com.example.tinymixer.dao;

import com.example.tinymixer.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByName(String name);


    Iterable<Item> findAllByPrice(double price);
}

