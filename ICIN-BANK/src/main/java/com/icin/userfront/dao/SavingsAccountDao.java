package com.icin.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
