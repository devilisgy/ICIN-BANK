package com.icin.userfront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
