package com.prolik.java.dao;

import com.prolik.java.vo.CustomerModel;
import com.prolik.java.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {

    void create(CustomerModel model);

    void update(CustomerModel model);

    void delete(int uuid);

    CustomerModel getByUuid(int uuid);

    List<CustomerModel> getByCondition(CustomerQueryModel queryModel);


}
