package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void openAccount(int money);

	public String createAccountNum(); // 

	public String findDate();

	public ArrayList<AccountBean> findAll();

	public AccountBean findByAccountNum(String accountNum);

	public int countAccount();

	public boolean existAccountNum(String accountNum);

	public void depositMoney(String accountNum, int money);

	public void withdrawMoney(String accountNum, int money);

	public void deleteAccountNum(String accountNum);
}