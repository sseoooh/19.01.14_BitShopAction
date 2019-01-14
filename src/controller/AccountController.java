package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = AccountServiceImpl.getInstance();
		System.out.println("(1)어카운트 서블릿으로 들어옴!!");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move": cmd;
		System.out.println("(2)cmd :"+ cmd);
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}
		System.out.println("(3)dir :"+dir);
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		System.out.println("(4)page :"+page);
		String dest = request.getParameter("dest");
		if(dest == null) {page = "NONE";}
		switch(cmd) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir, page);
			break;
		case "open-account":
			String money = request.getParameter("money");
			System.out.println("계좌개설시 입금한 돈 ?"+money);
			accountService.openAccount(Integer.parseInt(money));
			AccountBean acc = accountService.findByAccountNum("");
			request.setAttribute("acc", acc);
			Command.move(request, response, dir, page);
			break;
		case "account-detail":
			
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}