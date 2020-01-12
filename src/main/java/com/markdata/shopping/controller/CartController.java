package com.markdata.shopping.controller;

import com.markdata.shopping.model.vo.Item;

import java.util.List;

public interface CartController {
    List<Item> getItems();
    void storeItem();
}
