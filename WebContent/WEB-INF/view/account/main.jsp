<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%System.out.println("view/member/main.jsp에진입\n"); %>
	<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css "/>
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
		<%@ include file="../home/header.jsp" %>
			
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td style="width:30%">
		<%
		String dest = String.valueOf(request.getAttribute("dest"));
		switch(dest){
		case "NONE": case "account-detail":
			%>
			<%@ include file="account-detail.jsp" %>
			<%
			break;
		case "open-form":
			%>
			<%@ include file="open-form.jsp" %>
			<%
			break;
		case "":
			
			break;
		}
		%>
		</td>
	</tr>
</table>
</body>
</html>