package com.icin.userfront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

