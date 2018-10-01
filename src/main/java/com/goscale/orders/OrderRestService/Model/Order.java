package com.goscale.orders.OrderRestService.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

  //  @JsonIgnoreProperties(value = "true")
    public class Order {
    //    @JsonProperty("restlatandlong")
        private List<Double> restlatandlong;
      //  @JsonProperty("OrderTimeAndDate")
        private String OrderTimeAndDate;
        //@JsonProperty("OrderId")
        private String OrderId;

        public List<Double> getRestlatandlong() {
            return restlatandlong;
        }

        public void setRestlatandlong(List<Double> restlatandlong) {
            this.restlatandlong = restlatandlong;
        }

        public String getOrderTimeAndDate() {
            return OrderTimeAndDate;
        }

        public void setOrderTimeAndDate(String orderTimeAndDate) {
            OrderTimeAndDate = orderTimeAndDate;
        }

        public String getOrderId() {
            return OrderId;
        }

        public void setOrderId(String orderId) {
            OrderId = orderId;
        }

        public Order(List<Double> restlatandlong, String orderTimeAndDate, String orderId) {
            this.restlatandlong = restlatandlong;
            OrderTimeAndDate = orderTimeAndDate;
            OrderId = orderId;
        }


    }
