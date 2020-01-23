package com.markdata.shopping.service.impl;

import com.markdata.shopping.model.vo.Item;
import com.markdata.shopping.repository.CartRepository;
import com.markdata.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Item> getAllItems() {
        List items = new ArrayList<>();
        cartRepository.findAll().forEach(items::add);
        return items;
        //return itemStore();
    }

    @Override
    public void storeItem(Item item) {
        cartRepository.save(item);
    }

    private List<Item> itemStore(){
        Item item1 = new Item();
        item1.setName("Nirma");
        item1.setPrice(200.02);

        Item item2 = new Item();
        item2.setName("SurfExcel");
        item2.setPrice(175.00);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);

        return itemList;
    }
}
