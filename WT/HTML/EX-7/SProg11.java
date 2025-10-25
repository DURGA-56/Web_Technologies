/* SKYPORT GUIDE - URL REWRITING PART 1 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg11 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("userName");

        out.println("<html><head><title>Welcome</title>");
        out.println("<style>");
        out.println("body { background: url('https://e1.pxfuel.com/desktop-wallpaper/261/759/desktop-wallpaper-kempegowda-international-airport-hok-bangalore-airport.jpg') no-repeat center center fixed;");
        out.println("background-size: cover; font-family: Arial; text-align: center; color: #333; padding-top: 150px; }");
        out.println(".box { background: rgba(255,255,255,0.9); display: inline-block; padding: 30px 50px; border-radius: 15px; }");
        out.println("a.button { background-color: #0078D7; color: white; text-decoration: none; padding: 10px 20px; border-radius: 5px; }");
        out.println("a.button:hover { background-color: #005fa3; }");
        out.println("</style></head><body>");

        out.println("<div class='box'>");
        out.println("<h2>Welcome to SkyPort Guide, " + name + "!</h2>");
        out.println("<p>Thank you for visiting our Smart Airport Portal.</p>");
        out.println("<a href='SProg12?uname=" + name + "' class='button'>Explore Airport Services</a>");
        out.println("</div></body></html>");
    }
}
