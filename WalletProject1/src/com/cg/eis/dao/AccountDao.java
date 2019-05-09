package com.cg.eis.dao;

import java.util.Map;

import com.cg.eis.bean.Account;

public interface AccountDao {
	public boolean createAccount(Account ac);
	public Account getAccountByMobile(int mobileNo);
	public  Map<Integer,Account>getAllAccount();
	public boolean updateAccount(Account ac);
}
