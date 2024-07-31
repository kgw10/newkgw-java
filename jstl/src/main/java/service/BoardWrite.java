package service;

import javax.servlet.http.HttpServletRequest;

public class BoardWrite implements MainActive {
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getParameter("method");
		if(method != null) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer=(String)request.getSession().getAttribute("user");
			
			BoardDTO dto = new BoardDTO(Writer, title, content);
			
			BoardDAO dao = new BoardDAO();
			
			dao.save(dto);
			try {	response.sendRedirect("")
				return null;
				
			} else {
				return "board/boardWrite.jsp";
			}
		}
	}
}
