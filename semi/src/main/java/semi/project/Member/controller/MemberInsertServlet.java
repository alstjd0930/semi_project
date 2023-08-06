package semi.project.Member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.DAO.SemiService;
import semi.project.DTO.MemberDto;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/member/insert")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/member/insert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//int custno = request.getParameter("custno");
		request.setCharacterEncoding("UTF-8");
		String custname=request.getParameter("custname");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String grade=request.getParameter("grade");
		String city=request.getParameter("city");
		
//		MemberDto dto = new MemberDto();
//		dto.setCustname(custname);
//		dto.setPhone(phone);
//		dto.setAddress(address);
//		dto.setGrade(grade);
//		dto.setCity(city);
		//MemberDto dto = new MemberDto(0, custname, phone, address, null, grade, city)
		SemiService service = new SemiService();
		int result = service.insertMember(new MemberDto(custname, phone, address, grade, city));
		
//		System.out.println("[insert servlet] "+dto);

		response.sendRedirect(request.getContextPath()+"/member/list");
	
	}

}
