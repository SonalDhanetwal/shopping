package com.markdata.shopping.service;

import com.markdata.shopping.model.vo.Item;

import java.util.List;

public interface CartService {
    List<Item> getAllItems();
    void storeItem(Item item);
}
