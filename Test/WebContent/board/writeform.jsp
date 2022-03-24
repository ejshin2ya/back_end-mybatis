<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 등록</title>
<%@ include file="/common/header.jsp"%>
</head>
<body>
	<div class="container">
		<h2>글 작성</h2>
		<form action="board?act=write" method="POST">
			<div class="mb-3">
				<label for="title" class="form-label">이름</label> <input type="text"
					class="form-control" id="name" name="name">
			</div>
			<div class="mb-3">
				<label for="writer" class="form-label">나이</label> <input type="text"
					class="form-control" id="age" name="age">
			</div>
			<div class="mb-3">
				<label for="writer" class="form-label">부서번호</label> <input type="text"
					class="form-control" id="deptno" name="deptno">
			</div>
			
			<div class="mb-3">
				<label for="content" class="form-label">부서이름</label> 
				<select class="form-select" aria-label="Default select example" name="deptname">
					<option selected>Open this select menu</option>
					<option value="ssafy">ssafy</option>
					<option value="ssafy">ssafit</option>
					<option value="ssafy">ssaedu</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">부서위치</label> <input
					type="text" class="form-control" id="location" name="location">
			</div>
			<button class="btn btn-primary">등록</button>
		</form>
	</div>
</body>
</html>