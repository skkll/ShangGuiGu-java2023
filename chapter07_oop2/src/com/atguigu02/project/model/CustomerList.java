package com.atguigu02.project.model;

/**
 * @author 尚硅谷-宋红康
 * @create 17:17
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length)
            return false;
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) return false;

        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
//        向前移动，数组最后最后一个元素指向null，并且数组的长度减少一个
        customers[--total] = null;

        return true;
    }

    public Customer[] getAllCustomers() {
//        数组的复制
        Customer[] custs = new Customer[total];
//        for (int i = 0; i < total; i++) {
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public int getTotal() {
        return total;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;

        return customers[index];
    }
}
