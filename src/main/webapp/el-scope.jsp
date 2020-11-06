<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Scope</title>
<jsp:include page="common/layout.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<table class="table">
			<tr>
				<td>Application Scope</td>
				<td>${(not empty applicationScope.counter)?applicationScope.counter.count :'0' }</td>
			</tr>
			<tr>
				<td>Session Scope</td>
				<td>${(not empty sessionScope.counter)?sessionScope.counter.count :'0' }</td>
			</tr>
			<tr>
				<td>Request Scope</td>
				<td>${(not empty requestScope.counter)?requestScope.counter.count :'0' }</td>
			</tr>
			<tr>
				<td></td>
				<td><a href="countUp">CountUp</a></td>
			</tr>
		</table>
	</div>
</body>
</html>