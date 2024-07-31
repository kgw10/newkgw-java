package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public interface MainActive {
	public String action(HttpServletRequest request, HttpServletResponse response); 
	
	if(request.getSession().getAttribute("user") != null) {
		request.getSession().removeAttribute("user");	// user 세션 삭제
		
	} else {
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPassword");
		
		//
		MemberDAO dao = new MemberDAO();
		boolean isSuccess = dao.login(id,  pw);
		if( isSuccess) {
			request.getSession().setAttribute("user", id);
		}
	}
	
	try {
		response.sendRedirect("/");
		
	}
}