package com.company.service;

import com.company.entities.Customer;
import com.company.entities.DeliveryCompany;
import com.company.entities.Order;

import java.util.Date;
import java.util.List;

public interface Interface {

    int acceptOrder(DeliveryCompany deliveryCompany, Order order);

    void createCompany(DeliveryCompany deliveryCompany);

    int getTotalFee(Customer customer);

    int getCompanyProfit(DeliveryCompany deliveryCompany,Customer customer);
}
