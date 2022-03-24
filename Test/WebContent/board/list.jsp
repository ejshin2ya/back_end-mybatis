<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 목록</title>
<%@ include file="/common/header.jsp"%>
</head>
<body>
<div class="container">
	
		<h2>직원목록</h2>
		<hr>
		<div>
			<table class="table text-center">
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
					<th>부서번호</th>
					<th>부서이름</th>
					<th>부서위치</th>
				</tr>
				<c:forEach items="${list }" var="board">
					<tr>
						<td>${board.id}</td>
						<td>
							<a href="board?act=detail&id=${board.id}">${board.name}</a>
						</td>
						<td>${board.age }</td>
						<td>${board.deptno}</td>
						<td>${board.deptname}</td>
						<td>${board.location}</td>
					</tr>
				</c:forEach>
			</table>
			<div class="d-flex justify-content-end">
				<a class="btn btn-outline-primary" href="board?act=main">home</a>
				<a class="btn btn-outline-danger" href="board?act=writeform">등록</a>
			</div> 
		</div>
	</div>
</body>
</html>