package servlet.exam10;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="exam10.ExceptionHandlingController", urlPatterns="/exam10/ExceptionHandlingController")
public class ExceptionHandlingController extends HttpServlet {
	
	//클라이언트가 요청할 때 마다 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String data = "1oo";
			int num = Integer.parseInt(data);
			
			response.sendRedirect("ContentController");
		}catch(Exception e) {			
			request.getRequestDispatcher("/WEB-INF/views/exam10/error.jsp").forward(request, response);;
		}
		
		
	}
	
	
	

}
