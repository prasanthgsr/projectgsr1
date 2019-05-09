package com.cg.eis.pl;
import com.cg.eis.service.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import com.cg.eis.bean.*;
public class MyWallet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WalletService service=new WalletServiceImpl();
		
		Account ob1=new Account(100,"Ram",1230414123,25000.00);
		boolean added=service.createAccount(ob1);
		System.out.println("account added "+added);
		
		Account ob2=new Account(101,"Sham",1230414124,35000.00);
		added=service.createAccount(ob2);
		System.out.println("account added "+added);
		System.out.println("enter new name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String m=br.readLine();
		System.out.println("enter mobile no");
		String k=br.readLine();
		int j=Integer.parseInt(k);
		boolean l=service.updateAccount(ob1,m,j);
		System.out.println("changed"+l);
		Map<Integer,Account>allac=service.getAllAccount();
		System.out.println(allac);

				
		

	}

}
