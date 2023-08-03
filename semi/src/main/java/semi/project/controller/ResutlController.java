package semi.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.project.model.UserDao;
import semi.project.model.UserDto;

/**
 * Servlet implementation class ResutlController
 */
@WebServlet("/user/result")
public class ResutlController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResutlController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao =new UserDao();
		List<UserDto> result = dao.selectList();
		request.setAttribute("list", result);
		request.getRequestDispatcher("/WEB-INF/view/user/result.jsp").forward(request, response);
	
	}


//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
