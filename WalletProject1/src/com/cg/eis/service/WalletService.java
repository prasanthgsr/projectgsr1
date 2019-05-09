package com.cg.eis.service;
import java.util.Map;
import com.cg.eis.bean.Account;
public interface WalletService {
String mobilePattern="[0-9] {10}"; //10 digit mobile Pattern for 10 digit mobile number
public boolean  validateMobile(String mobile);
public boolean updateAccount(Account ac,String name,int mobileNo);
public boolean createAccount(Account ac);
public Account getAccountByMobile(int mobileNo);
public  Map<Integer,Account>getAllAccount();
}
