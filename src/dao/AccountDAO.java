package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {

	public void insertAccount(int money); // accountNum
	
	public ArrayList<AccountBean> selectAllAccounts();
	public AccountBean findByAccountNum(String accountNum);
	public int accountCount();
	
	public void depositMoney(String accountNum, int money);
	public void withdrawMoney(String accountNum, int money);
	
	public void removeAccount(String accountNum);
}
