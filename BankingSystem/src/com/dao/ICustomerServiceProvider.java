package com.dao;

import java.sql.SQLException;

import com.dto.AccountAndCustomer;
import com.exception.InsufficientFundException;
import com.exception.InvalidAccountException;
import com.exception.OverDraftLimitExcededException;
import com.model.Account;

public interface ICustomerServiceProvider {

	float getAccountBalance(long accountNumber) throws SQLException, InvalidAccountException;
	int deposit(long accountNumber, double amount)throws SQLException, InvalidAccountException;
	int withdraw(long accountNumber, float amount)throws SQLException, InvalidAccountException, InsufficientFundException, OverDraftLimitExcededException;
	Account getDetails(long accountNumber)throws SQLException, InvalidAccountException;
	
	AccountAndCustomer getAccountDetails(long accountNumber) throws SQLException, InvalidAccountException;
}
