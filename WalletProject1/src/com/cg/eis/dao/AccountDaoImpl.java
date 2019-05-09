package com.cg.eis.dao;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cg.eis.bean.Account;
public class AccountDaoImpl implements AccountDao{

	//Wallet Account database
	Map<Integer,Account>walletAccounts=new ConcurrentHashMap<>();
	
	/*
      Method to  insert new account in a database
	 */
	@Override
	public boolean createAccount(Account ac) {
		walletAccounts.put(ac.getMobileNo(), ac);
		Account ac1=walletAccounts.get(ac.getMobileNo());
		if(ac1!=null)
		return true;
		else
			return false;
	}
	/*
    Method to retreive  account by mobiloe number from database
	 */
	@Override
	public Account getAccountByMobile(int mobileNo) {
      Account ac=walletAccounts.get(mobileNo);
      if(ac!=null)
		return ac;
      else
    	  return null;
	}

	@Override
	public Map<Integer, Account> getAllAccount() {
		// TODO Auto-generated method stub
		return walletAccounts;
	}
	@Override
	public boolean updateAccount(Account ac) {
		
        
		return true;
	}

}
