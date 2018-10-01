package com.goscale.orders.OrderRestService.Controller;

import com.goscale.orders.OrderRestService.Model.Order;
import com.goscale.orders.OrderRestService.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderDetailsController {

    //Order order=new Order("12.987860, 77.737076","");

    OrderService service = new OrderService();

    @RequestMapping(value= "/orders", produces="application/json")
    public List<Order> viewOrderDetails(){
        return service.getAllOrders();
    }

}

