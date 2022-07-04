package com.company.entities;

import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final int pricePerKilogram;
    private List<Customer> customers;
    private final int maxCapacityPerSquareMeter;

    public DeliveryCompany(String deliveryCompanyName, int pricePerKilogram, List<Customer> customers, int maxCapacityPerSquareMeter) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.pricePerKilogram = pricePerKilogram;
        this.customers = customers;
        this.maxCapacityPerSquareMeter = maxCapacityPerSquareMeter;
    }


    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public int getPricePerKilogram() {
        return pricePerKilogram;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getMaxCapacityPerSquareMeter() {
        return maxCapacityPerSquareMeter;
    }


    public int getTotalFee1(Customer customer){
        int totalFee = 0;
        for (int i = 0; i<customers.size(); i++) {
            if (customers.get(i).getCustomerName().equals(customer.getCustomerName())){
                totalFee+=(customer.getOrder().get(i).getOrderFee());
            }
        }
        return totalFee;
    }


    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", pricePerKilogram=" + pricePerKilogram +
                ", customers=" + customers +
                ", maxCapacityPerSquareMeter=" + maxCapacityPerSquareMeter +
                '}';
    }
}
