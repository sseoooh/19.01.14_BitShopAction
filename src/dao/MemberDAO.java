package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	
		
		public void insertMember(MemberBean member);
		
		public ArrayList<MemberBean> selectMembers();
		public ArrayList<MemberBean> selectMembersByName(String name);
		public MemberBean selectMemberById(String id);
		public int countMembers();
		
		public void updateMember(MemberBean member);
		
		public void deleteMember(String id, String pass);
}
