/* Hidden Form Fields - 1 (SkyPort Guide) */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg9 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            String sessionId = request.getSession().getId();
            String visitTime = new java.util.Date().toString();


            out.println("<html><head><title>SkyPort Guide</title>");
            out.println("<style>");
            out.println("body { font-family: 'Poppins', sans-serif; background: url('https://images.pexels.com/photos/912050/pexels-photo-912050.jpeg?cs=srgb&dl=pexels-ahmedmuntasir-912050.jpg&fm=jpg') no-repeat center center/cover; height: 100vh; display: flex; justify-content: center; align-items: center; }");
            out.println(".box { background: rgba(243, 227, 240); padding: 40px; border-radius: 20px; text-align: center; width: 420px; box-shadow: 0 8px 20px rgba(0,0,0,0.2); }");
            out.println("h2 { color: #3b3b98; } p { color: #444; }");
            out.println("input[type=submit] { background: linear-gradient(90deg, #6a11cb, #2575fc); color: white; border: none; padding: 12px 20px; border-radius: 10px; cursor: pointer; transition: 0.3s; }");
            out.println("input[type=submit]:hover { background: linear-gradient(90deg, #2575fc, #6a11cb); }");
            out.println("</style></head><body>");
            out.println("<div class='box'>");
            out.println("<h2>Flight Confirmation</h2>");
            out.println("<p>Welcome, <strong>" + n + "</strong>!</p>");
            out.println("<form action='SProg10' method='POST'>");
            out.println("<input type='hidden' name='uname' value='" + n + "'>");
            out.print("<input type='hidden' name='sessionId' value='" + sessionId + "'>");
            out.print("<input type='hidden' name='visitTime' value='" + visitTime + "'>");
            out.println("<input type='submit' value='Proceed to Boarding'>");
            out.println("</form>");
            out.println("</div></body></html>");

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
