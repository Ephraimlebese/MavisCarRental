package com.example.elebese.maviscarrental.services.Imp;

import com.example.elebese.maviscarrental.model.Customer;
import com.example.elebese.maviscarrental.repositories.RestCustomerAPI;
import com.example.elebese.maviscarrental.services.CustomerService;

/**
 * Created by elebese on 2015/09/25.
 */
public class CustomerServiceImpl implements CustomerService{
    //CREATES SERVICE OBJECT
    final RestCustomerAPI rest = new com.example.elebese.maviscarrental.repositories.rest.RestCustomerAPI();

    @Override
    public String addCustomer(Customer entity)
    {
        return rest.addCustomer(entity);
    }
}
