/* Smart Airport Guide - to set cookies */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg5 extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try {
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();

        String in_data = request.getParameter("userin");
        Cookie c = new Cookie("SkyCookie", in_data);
        response.addCookie(c);

        // Optional short pause before redirect (looks smoother)

        response.setHeader("Refresh", "3; URL=SProg6.html");

        pwriter.println("<html><head><title>Cookie Saved</title>");
        pwriter.println("<style>");
        pwriter.println("body{margin:0;height:100vh;font-family:Segoe UI, sans-serif;background:linear-gradient(135deg,#1E88E5,#42A5F5);display:flex;justify-content:center;align-items:center;color:#333;}");
        pwriter.println(".card{background:white;padding:40px 60px;border-radius:15px;text-align:center;box-shadow:0 4px 20px rgba(0,0,0,0.3);width:380px;}");
        pwriter.println("h2{color:#0D47A1;margin-bottom:10px;}");
        pwriter.println("a{display:inline-block;margin-top:25px;padding:10px 20px;background:#1E88E5;color:white;text-decoration:none;border-radius:8px;transition:0.3s;}a:hover{background:#1565C0;}");
        pwriter.println("</style></head><body>");
        pwriter.println("<div class='card'>");
        pwriter.println("<h2>Smart Airport Guide</h2>");
        pwriter.println("<p><b>Cookie Saved Successfully!</b></p>");
        pwriter.println("<h3 style='color:#1E88E5;'>" + in_data + "</h3>");
        pwriter.println("<p>Your airport preference has been stored for SkyPort Guide.</p>");
        pwriter.println("<p style='font-size:13px;color:gray;'>Redirecting to view your cookie in 3 seconds...</p>");
        pwriter.println("<a href='SProg6.html'>Go Now</a>");
        pwriter.println("</div></body></html>");

        pwriter.close();
     } catch(Exception exp) {
       System.out.println(exp);
     }
  }
}
