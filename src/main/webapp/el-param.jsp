<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="">
		<input type="text" name="username" value="${(not empty param.username)? param.username : ''}">
		<input type="submit" value="send">
	</form>
	<c:if test="${not empty param.username }">
		Hello:${param.username }
	</c:if>
	
	<%-- <%
		String name=request.getParameter("username");
		if(name!=null){
			out.print("Hello"+name);
		}
	%> --%>
</body>
</html>