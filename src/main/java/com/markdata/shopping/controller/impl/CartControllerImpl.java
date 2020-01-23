package com.markdata.shopping.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.markdata.shopping.controller.CartController;
import com.markdata.shopping.model.vo.Item;
import com.markdata.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartControllerImpl implements CartController {

    @Autowired
    CartService cartService;

    @Override
    @RequestMapping("/")
    public List<Item> getItems() {
        return cartService.getAllItems();
    }

    @Override
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void storeItem() {
        Item item = new Item();
        item.setName("tide");
        item.setPrice(90.09);
        cartService.storeItem(item);
    }

    @RequestMapping("/getmessage")
    public String hello(){
        return "hello from sid";
    }
}
