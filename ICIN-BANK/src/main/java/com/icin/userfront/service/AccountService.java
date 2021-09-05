package com.icin.userfront.service;

import java.security.Principal;

import com.icin.userfront.domain.PrimaryAccount;
import com.icin.userfront.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
