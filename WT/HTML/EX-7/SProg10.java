/* Hidden Form Fields - 2 (SkyPort Guide) */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg10 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("uname");
            String id = request.getParameter("sessionId");
            String time = request.getParameter("visitTime");



            out.println("<html><head><meta charset='UTF-8'><title>SkyPort Guide</title></head>");
            out.println("<style>");
            out.println("body { font-family: 'Poppins', sans-serif; background: url('https://images.pexels.com/photos/912050/pexels-photo-912050.jpeg?cs=srgb&dl=pexels-ahmedmuntasir-912050.jpg&fm=jpg') no-repeat center center/cover; height: 100vh; display: flex; justify-content: center; align-items: center; }");
            out.println(".success { background: rgba(243, 227, 240); padding: 40px; border-radius: 20px; text-align: center; width: 450px; box-shadow: 0 8px 20px rgba(0,0,0,0.2); }");
            out.println("h2 { color: #2ecc71; } p { color: #333; font-size: 16px; }");
            out.println("</style></head><body>");
            out.println("<div class='success'>");
            out.println("<h2>Registration Successful ✈️</h2>");
            out.println("<p>Hello <strong>" + n + "</strong>!<br>Your SkyPort flight registration is confirmed.</p>");
            out.println("<p>Enjoy your hassle-free journey!</p>");
            out.println("<p>Session ID: " + id + "</p>");
            out.println("<p>Visit Time: " + time + "</p>");
            out.println("</div></body></html>");

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }
}
