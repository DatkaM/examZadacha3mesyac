package com.company.service;

import com.company.entities.Customer;
import com.company.entities.DeliveryCompany;
import com.company.entities.Order;

import java.util.*;

public class DeliveryCompanyService implements Interface {

    static Scanner scanner = new Scanner(System.in);
    private List<DeliveryCompany> deliveryCompanies;


    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        DeliveryCompanyService.scanner = scanner;
    }

    public List<DeliveryCompany> getDeliveryCompanies() {
        return deliveryCompanies;
    }

    public void setDeliveryCompanies(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    @Override
    public String toString() {
        return "DeliveryCompanyService{" +
                "deliveryCompanies=" + deliveryCompanies +
                '}';
    }

    @Override
    public int acceptOrder(DeliveryCompany deliveryCompany, Order order) { //zakaz salat, vmestimost kaitarat
        for (int i = 0; i < deliveryCompanies.size(); i++) {
            if (deliveryCompanies.get(i).getDeliveryCompanyName().equals(deliveryCompany.getDeliveryCompanyName())){
                deliveryCompanies.get(i).getCustomers().get(i).getOrder();
            }

        }
        return 100;
    }

    @Override
    public void createCompany(DeliveryCompany deliveryCompany) { //create company
        deliveryCompanies.add(deliveryCompany);
    }

    @Override
    public int getTotalFee(Customer customer) { // get customer total fee
        for (DeliveryCompany d:deliveryCompanies) {
            return d.getTotalFee1(customer);

        }
        return 0;
    }

    @Override
    public int getCompanyProfit(DeliveryCompany deliveryCompany,Customer customer) { // vozvrashaet pribyl compani
        int companyProfitCounter = 0;
        for (DeliveryCompany d : deliveryCompanies) {
            if (d.getDeliveryCompanyName().equals(deliveryCompany.getDeliveryCompanyName())) {
                companyProfitCounter += ((int) d.getPricePerKilogram() *d.getTotalFee1(customer));
            }
        }
        return companyProfitCounter;
    }
}