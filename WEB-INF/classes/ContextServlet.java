import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        ServletContext application  = this.getServletContext();
		Integer count = (Integer)application.getAttribute("count");
		if(count == null) {
			count = 1;
		} else {
			count++;
		}
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charset=GBK");
		response.getWriter().print("Õ¯’æ∑√Œ ¡À" + count + "¥Œ");
		application.setAttribute("count", count);
    }
}