package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;
import domain.AccountBean;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//이부분 복습해보자
		String context = request.getContextPath();
		HttpSession session = request.getSession();
		session.setAttribute("context", context);
		
		MemberBean member = null;
		MemberService memberService = MemberServiceImpl.getInstance();
		AccountBean acc = null;
		System.out.println("(1)멤버서블릿으로 들어옴!!");
		/**
		 * 디폴트 값
		 * cmd : move
		 * dir : member
		 * page : main
		 * dest : NONE
		 * */
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move": cmd;
		System.out.println("(2)cmd :"+ cmd);
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}
		
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		String dest = request.getParameter("dest");
		if(dest == null) {dest = "NONE";}
		
		session = request.getSession();
		
		switch(cmd) {
		case "login":
			
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			
			boolean loginOk = memberService.existMember(id, pass);
			
			if(loginOk) {
				
				dir = "";
				page = "index";
			}
				System.out.println("(3)dir :"+dir);
				System.out.println("(4)page :"+page);
				session = request.getSession();//싱글톤 패턴
				session.setAttribute("user", member);//세션에있는 유저는 모두 멤버의 객체다
				/*request.setAttribute("member", member);*/
				request.setAttribute("dest", "welcome");
				
			
			break;
		case "move":
			request.setAttribute("dest", dest);
			
			break;
		case "join":
			System.out.println("cmd:::"+cmd+"\n"+"dir:::"+dir+"\n"+"dest:::"+dest+"\n"+"page:::"+page+"\n");
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			
			MemberServiceImpl.getInstance().createMember(member);
			member = MemberServiceImpl.getInstance().findMemberById(member.getId());
			
			request.setAttribute("member", member);
			request.setAttribute("dest", dest);
			/*session = request.getSession();//싱글톤 패턴
			session.setAttribute("user", member);//세션에있는 유저는 모두 멤버의 객체다
*/			
			
			System.out.println("member:::::"+member+"\n"+"dest:::::"+dest);
			break;
		case "logout":
			dir = "";
			page = "index";
			dest = "";
			/*session.invalidate();*/
			break;
		case "detail":
			dir = "member";
			page = "main";
			request.setAttribute("dest", "detail");
			id = request.getParameter("id"); 
			/*request.setAttribute("member",memberService.findMemberById(id));*/
			break;
		}
		Command.move(request, response, dir,page);
		System.out.println("dir::::"+dir+"page::::"+page);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}