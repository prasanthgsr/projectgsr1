package com.cg.eis.service;
import java.util.Map;
import com.cg.eis.bean.Account;
import com.cg.eis.dao.AccountDao;
import com.cg.eis.dao.AccountDaoImpl;

public class WalletServiceImpl implements WalletService{

	/*
    WalletService is connecting to AccountDao 
	 */
	AccountDao accountdao=new AccountDaoImpl();
	@Override
	public boolean validateMobile(String mobile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createAccount(Account ac) {
		// TODO Auto-generated method stub
		return accountdao.createAccount(ac);
	}

	@Override
	public Account getAccountByMobile(int mobileNo) {
		// TODO Auto-generated method stub
		return accountdao.getAccountByMobile(mobileNo);
	}

	@Override
	public Map<Integer, Account> getAllAccount() {
		// TODO Auto-generated method stub
		return accountdao.getAllAccount();
	}

	@Override
	public boolean updateAccount(Account ac,String name,int mobileNo) {
		// TODO Auto-generated method stub
		String k=ac.getCustomerName();

		k=name;
		 int m=ac.getMobileNo();
		 
		m=mobileNo;
		 ac.setCustomerName(k);
		 ac.getCustomerName();
		 ac.setMobileNo(m);
		 ac.getMobileNo();
		 
		 return accountdao.updateAccount(ac);
		
		
	}

}
