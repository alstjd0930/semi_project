package semi.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.DAO.MemberDao;
import semi.project.DTO.MemberDto;


@WebServlet("/member/salary")
public class MoneyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MoneyListServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		List<MemberDto> result = dao.MoneyList();
		request.setAttribute("list", result);
		
		
		request.getRequestDispatcher("/WEB-INF/view/member/salary.jsp").forward(request, response);
	}


//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//	}

}
