<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% System.out.println("home/welcome.jsp진입"); %>
<div id="welcome">

	 ${user.name}님 환영합니다
	 <a href="member.do?cmd=logout">로그아웃</a>
	
</div>