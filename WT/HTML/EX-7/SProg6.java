/* Smart Airport Guide - to receive cookies */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg6 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try {
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();

        Cookie[] ck = request.getCookies();

        pwriter.println("<html><head><title>Cookie Retrieved</title>");
        pwriter.println("<style>");
        pwriter.println("body{margin:0;height:100vh;font-family:Segoe UI, sans-serif;background:linear-gradient(135deg,#ba68c8,#f3e5f5);display:flex;justify-content:center;align-items:center;}");
        pwriter.println(".card{background:#FFFFFF;padding:40px 60px;border-radius:15px;text-align:center;box-shadow:0 4px 20px rgba(0,0,0,0.3);width:380px;}");
        pwriter.println("h2{color:#0D47A1;margin-bottom:20px;}");
        pwriter.println("a{display:inline-block;margin-top:25px;padding:10px 20px;background:#1E88E5;color:white;text-decoration:none;border-radius:8px;transition:0.3s;}a:hover{background:#1565C0;}");
        pwriter.println("</style></head><body>");
        pwriter.println("<div class='card'>");
        pwriter.println("<h3>SkyPort Guide - Cookie Retrieved</h3>");


        if (ck != null) {
            for (Cookie cookie : ck) {
                pwriter.println("<p><b>Name:</b> " + cookie.getName() + "</p>");
                pwriter.println("<p><b>Value:</b> " + cookie.getValue() + "</p>");
            }
        } else {
            pwriter.println("<p>No cookies found!</p>");
        }

        pwriter.println("<a href='SProg5.html'>Go Back</a>");
        pwriter.println("</div></body></html>");
        pwriter.close();
     } catch(Exception exp) {
       System.out.println(exp);
     }
  }
}
