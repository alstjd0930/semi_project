package semi.project.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.model.dao.MemberDao;
import semi.project.model.dao.SemiService;
import semi.project.model.dto.MemberDto;

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
		MemberDao dao = new MemberDao();
		SemiService service = new SemiService();
		int result=service.nextCustno();
		request.setAttribute("custno", result);		
		System.out.println("insertGet");
		request.getRequestDispatcher("/WEB-INF/view/member/insert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SemiService service = new SemiService();
		//MemberDao dao = new MemberDao();
		request.setCharacterEncoding("UTF-8");
		//String custno = request.getParameter("custno");
		
		String custname=request.getParameter("custname");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String grade=request.getParameter("grade");
		String city=request.getParameter("city");
		
		MemberDto dto = new MemberDto(custname, phone, address, grade, city);
		dto.setCustname(custname);
		dto.setPhone(phone);
		dto.setAddress(address);
		dto.setGrade(grade);
		dto.setCity(city);
		
		int result = service.insert(new MemberDto(custname, phone, address, grade, city));
		
		//System.out.println("[insert servlet] "+dto);

		response.sendRedirect(request.getContextPath()+"/member/list");
	
	}

}
