
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Courses</title>
<jsp:include page="common/layout.jsp"></jsp:include>
</head>
<body>
	<div class=container>
		<h3>All Courses</h3>
		<table class="table">
			<thead>
			<tr>
				<th>Name</th>
				<th>Level</th>
				<th>Fees</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${courses }" var="c">
					<tr>
						<td>${c.name }</td>
						<td>${c.level }</td>
						<td>${c.fees }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>