<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%System.out.println("view/article/main.jsp에진입\n"); %>
<%@ include file="../home/head.jsp" %>
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
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
	
		</td>
	</tr>
	<tr style="height: 100px">
		<td colspan="2">
		
		<%@ include file="../home/footer.jsp" %>
		
		</td>
	</tr>
</table>
</body>
</html>