package com.company.entities;

public class Order {
    private int orderFee; //zakazdyn bassy
    private Load load;

    public Order(int orderFee, Load load) {
        this.orderFee = orderFee;
        this.load = load;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderFee=" + orderFee +
                ", load=" + load +
                '}';
    }
}
