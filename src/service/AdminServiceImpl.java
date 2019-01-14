package service;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService{

	@Override
	public void createAdmin(String name, String pass, String auth) {
		AdminBean adminBean = new AdminBean();
		//adminBean.setAdminNum();
		adminBean.setAuth(auth);
		adminBean.setName(name);
		adminBean.setPass(pass);
		
	}

	@Override
	public ArrayList<AdminBean> list() {
		
		return null;
	}

	@Override
	public ArrayList<AdminBean> findByAuth(String auth) {
		return null;
	}

	@Override
	public AdminBean findById(String admin) {
		return null;
	}

	@Override
	public int countAdmin() {
		return 0;
	}

	@Override
	public boolean adminLogin(String adminNum, String pass) {
		return false;
	}

	@Override
	public void modifyAdminPass(String adminNum, String pass, String newPass) {
		
	}

	@Override
	public void deleteAdmin(String adminNum, String pass) {
		
	}

}
