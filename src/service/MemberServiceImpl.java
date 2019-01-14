package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public MemberServiceImpl() {dao = MemberDAOImpl.getInstance();}
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		/*dao.insertMember(member);*/
		MemberDAOImpl.getInstance().insertMember(member);
		
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean loginOk = false;
		MemberBean member = new MemberBean();
		/*member = dao.existMember(id, pass);*/
		if(member != null &&id.equals(member.getId()) && pass.equals(member.getPass())) {
			loginOk = true;
		}
		return loginOk;
	}

	@Override
	public void changeMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id) {
		
	}

}