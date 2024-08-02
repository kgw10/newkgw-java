package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DAO.CommentDAO;

public class CommentDelete implements MainActive {

	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int bid = Integer.parseInt( request.getParameter("id"));
		CommentDAO dao = new CommentDAO();
		dao.delete(comment);
		
		try {
			response.sendRedirect("/board.do");
		}catch(Exception e) {}
		
		return null;
	}

}
