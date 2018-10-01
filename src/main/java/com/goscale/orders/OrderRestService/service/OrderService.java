package com.goscale.orders.OrderRestService.service;

import com.goscale.orders.OrderRestService.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    public List<Order> getAllOrders() {
        List<Double> latlong = new ArrayList<>();
        latlong.add(12.987860);
        latlong.add(77.737076);

        Order o1 = new Order(latlong,"24/01/2000" , "123");
        Order o2 = new Order(latlong,"24/01/2000" , "122");
        Order o3 = new Order(latlong,"24/01/2000" , "124");
        Order o4 = new Order(latlong,"24/01/2000" , "125");
        Order o5 = new Order(latlong,"24/01/2000" , "126");
        List<Order> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);
        return orders;
    }
}
