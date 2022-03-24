package com.ssafy.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.board.config.MyAppSqlConfig;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

@WebServlet("/board")
public class BoardController extends HttpServlet {

	private BoardDao dao;

	private static final long serialVersionUID = 1L;

	public BoardController() {
		dao = MyAppSqlConfig.getSession().getMapper(BoardDao.class);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GET 요청은 안해도되는데 POST에서는 해야하는 작업
		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}

		// Front-Controller 패턴
		String act = request.getParameter("act");
		switch (act) {
		case "main":
			main(request, response);
			break;
		case "list":
			list(request, response);
			break;
		case "writeform":
			writeForm(request, response);
			break;
		case "write":
			write(request, response);
			break;
		case "detail":
			detail(request, response);
		case "updateform":
			updateform(request, response);
			break;
		case "update":
			update(request, response);
			break;
		case "delete":
			delete(request, response);
			break;

		}

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deleteBoard(id);
		response.sendRedirect("board?act=list");
		
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Board board= new Board();
		board.setId(Integer.parseInt(request.getParameter("id")));
		board.setName(request.getParameter("name"));
		board.setAge(Integer.parseInt(request.getParameter("age")));
		board.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		board.setDeptname(request.getParameter("deptname"));
		board.setLocation(request.getParameter("location"));
		
		dao.updateBoard(board);
		response.sendRedirect("board?act=list");
		
	}

	private void updateform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("board", dao.selectBoardById(Integer.parseInt(request.getParameter("id"))));
		request.getRequestDispatcher("/board/updateform.jsp").forward(request, response);
	}

	private void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		request.setAttribute("board", dao.selectBoardById(id));
		request.getRequestDispatcher("/board/detail.jsp").forward(request, response);
		
	}

	private void write(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Board board = new Board();

		board.setName(request.getParameter("name"));
		board.setAge(Integer.parseInt(request.getParameter("age")));
		board.setDeptname(request.getParameter("deptname"));
		board.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		board.setLocation(request.getParameter("location"));
		dao.insertBoard(board);
		response.sendRedirect("board?act=list");

		
	}

	private void writeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/board/writeform.jsp").forward(request, response);
		
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", dao.selectBoard());
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
		
	}
	private void main(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/board/main.jsp").forward(request, response);
		
	}
	
}