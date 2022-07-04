package com.company;

import com.company.entities.Customer;
import com.company.entities.DeliveryCompany;
import com.company.entities.Load;
import com.company.entities.Order;
import com.company.service.DeliveryCompanyService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Load load1 = new Load(5, 6, 7);
        Load load2 = new Load(3, 5, 7);
        Load load3 = new Load(9, 7, 7);
        Load load4 = new Load(3, 5, 7);

        Order order1 = new Order(3, load1);
        Order order2 = new Order(5, load2);
        Order order3 = new Order(4, load3);
        Order order4 = new Order(2, load4);
        List<Order>orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order4);

        Customer customer1 = new Customer("Zhusup", orders);
        Customer customer2 = new Customer("Jaulan", orders);
        Customer customer3 = new Customer("Nurmuhammad", orders);
        Customer customer4 = new Customer("Dastan", orders);

        List<Customer> customers = List.of(customer1,customer2,customer3);

        DeliveryCompany deliveryCompany1 = new DeliveryCompany("Fed-Ix", 2, customers, 5000);
        DeliveryCompany deliveryCompany2 = new DeliveryCompany("Amazon", 3, customers, 2000);
        DeliveryCompany deliveryCompany3 = new DeliveryCompany("Yandex", 4, customers, 1500);

        List<DeliveryCompany>deliveryCompanies = new ArrayList<>();

        deliveryCompanies.add(deliveryCompany1);
        deliveryCompanies.add(deliveryCompany2);
        deliveryCompanies.add(deliveryCompany3);

        deliveryCompanies.forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanies);
        deliveryCompanyService.createCompany(new DeliveryCompany("Glovo", 32, customers, 3400));
        deliveryCompanies.forEach(System.out::println);

        System.out.println("-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`");
        System.out.println(deliveryCompanyService.getTotalFee(customer1));
        System.out.println("Company profit: ");
        System.out.println(deliveryCompanyService.getCompanyProfit(deliveryCompany1,customer1));


        Set<DeliveryCompany> deliveryCompanySet = new HashSet<>(List.of(deliveryCompany1, deliveryCompany2, deliveryCompany3));
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanySet);
        deliveryCompanySet.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        deliveryCompanyService.createCompany(new DeliveryCompany("Delivery",45,customers,2000));
        deliveryCompanySet.forEach(System.out::println);
        System.out.println(deliveryCompanyService.getTotalFee(customer1));
    }
}

//        int[]nums = {1,2,3,4,5,6,7,8,9,10};
//        int val = 3;
//        System.out.println(elementDelete(nums, val));
//    }
//    public static int elementDelete(int [] nums,int val){
//        System.out.println("Before to the delete: "+ Arrays.toString(nums));
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            index = i;
//        }
//        System.out.println("All indexes is before deleting: "+index);
//        int [] newArray = new int[nums.length-1];
//        int j = 3;
//        for (int i = 0,m=0;i<nums.length;i++){
//            if (nums[i]!=j){
//                newArray[m]=nums[i];
//                m++;
//            }
//        }
//        System.out.println("After deleting: "+ Arrays.toString(newArray));
//        int index2 = 0;
//        for (int i = 0; i < newArray.length; i++) {
//            index2=i;
//        }
//        System.out.println("All indexes after delete: "+index2);
//        return index2;
