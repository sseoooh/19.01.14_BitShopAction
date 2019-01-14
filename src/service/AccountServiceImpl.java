package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private static AccountServiceImpl instance = new AccountServiceImpl(); 
	private AccountServiceImpl() {}
	public static AccountServiceImpl getInstance() {return instance;}


	@Override
	public void openAccount(int money) {
		AccountBean bean = new AccountBean();
		bean.setAccountNum(createAccountNum());
		bean.setMoney(money);
		bean.setToday(findDate());
		

	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String account = "";
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				a[i] += random.nextInt(9);
				account += a[i] + "-";
			} else {
				a[i] += random.nextInt(9);
				account += a[i] + "";
			}
		}
		return account;
	}

	@Override
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		return today.format(date);

	}

	@Override
	public ArrayList<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean bean = new AccountBean();

		return bean;

	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean exist = false;

		return exist;
	}

	@Override
	public void depositMoney(String accountNum, int money) {

	}

	@Override
	public void withdrawMoney(String accountNum, int money) {

	}

	@Override
	public void deleteAccountNum(String accountNum) {

			
		
		
	}

}