package packnew;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DefaultServlet")
public class DefaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String message;
    
    public DefaultServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		message = "HitGetMethod";
		request.setAttribute("message", message);
		Cookie msg = new Cookie("message",message);
		msg.setMaxAge(24*60*60);
		response.addCookie(msg);
		HttpSession session = request.getSession();
		session.setAttribute("message", message);
		request.getRequestDispatcher("show.jsp").forward(request,response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
