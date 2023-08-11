package semi.project.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.model.dao.SemiService;
import semi.project.model.dto.MemberDto;

/**
 * Servlet implementation class MemberModifyDoServlet
 */
@WebServlet("/member/modify.do")
public class MemberModifyDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SemiService service = new SemiService();
		
		request.setCharacterEncoding("UTF-8");
		String custNoStr = request.getParameter("custno");
		int custno = 0;
		try {
			custno = Integer.parseInt(custNoStr);
			} catch (NumberFormatException e) {
		
			}
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		System.out.println(custname);
		System.out.println(address);
		MemberDto dto = new MemberDto();
	
		dto.setCustno(custno);
		dto.setCustname(custname);
		dto.setPhone(phone);
		dto.setAddress(address);
		dto.setGrade(grade);
		dto.setCity(city);
		
		int result = service.update(dto);
		
		response.sendRedirect(request.getContextPath()+"/member/list");

	
	}

}
