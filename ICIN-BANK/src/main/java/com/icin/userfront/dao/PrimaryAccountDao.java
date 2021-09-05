package com.icin.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.PrimaryAccount;


public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
