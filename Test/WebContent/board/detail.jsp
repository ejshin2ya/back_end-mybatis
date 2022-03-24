<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 정보 상세</title>
<%@ include file="/common/header.jsp"%>
</head>
<body>
	<div class="container">
		<h2>글 상세보기</h2>
		<hr>
		<div class="card" style="width: 40rem;">
			<div class="card-body">
				<h5 class="card-name">이름  : ${board.name } </h5>
				<h6 class="card-age"> 나이 : ${board.age }</h6>
				<div class="d-flex flex-column bd-highlight mb-3">
					<div class="p-2 bd-highlight">부서 번호 :${board.deptno }</div>
					<div class="p-2 bd-highlight">부서 이름 :${board.deptname }</div>
					<div class="p-2 bd-highlight">부서 위치 :${board.location }</div>
					
				</div>
				<div>
					<a href="board?act=updateform&id=${board.id}" class="btn btn-success">수정</a> 
					<a href="board?act=delete&id=${board.id }" class="btn btn-info">삭제</a>
					<a href="board?act=list" class="btn btn-warning">목록</a>
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>