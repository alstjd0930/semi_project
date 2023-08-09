package semi.project.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.model.dao.SemiService;
import semi.project.model.dto.MemberDto;

@WebServlet("/member/modify")
public class MemberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MemberModifyServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custNoStr = request.getParameter("custno");
		int custno = 0;
		try {
			custno = Integer.parseInt(custNoStr);
		} catch (NumberFormatException e) {
		}
		
		
		SemiService memberService = new SemiService();
        MemberDto mvo = memberService.selectOne(custno);
        request.setAttribute("mvo", mvo);
		request.getRequestDispatcher("/WEB-INF/view/member/modify.jsp").forward(request, response);
	}


//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
