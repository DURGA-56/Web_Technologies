/* Session Example - Smart Airport Guide (Stylish View Page) */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg8 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      try {
         response.setContentType("text/html");
         PrintWriter pwriter = response.getWriter();

         HttpSession session = request.getSession(false);
         String myName = (String) session.getAttribute("uname");
         String myPass = (String) session.getAttribute("upass");

         pwriter.println("<html>");
         pwriter.println("<head>");
         pwriter.println("<title>Smart Airport Guide - User Details</title>");
         pwriter.println("<style>");
         pwriter.println("body {"
               + "font-family: 'Poppins', sans-serif;"
               + "background: url('https://images.unsplash.com/photo-1513002749550-c59d786b8e6c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c2t5fGVufDB8fDB8fHww&fm=jpg&q=60&w=3000') no-repeat center center fixed;"
               + "background-size: cover;"
               + "display: flex;"
               + "justify-content: center;"
               + "align-items: center;"
               + "height: 100vh;"
               + "margin: 0;"
               + "}");
         pwriter.println(".card {"
               + "background: rgba(255,255,255,0.9);"
               + "padding: 40px;"
               + "border-radius: 20px;"
               + "box-shadow: 0 8px 25px rgba(0,0,0,0.3);"
               + "text-align: center;"
               + "width: 350px;"
               + "}");
         pwriter.println(".btn {"
               + "display: inline-block;"
               + "margin-top: 20px;"
               + "padding: 10px 20px;"
               + "background: linear-gradient(to right, #007bff, #00a3e0);"
               + "color: white;"
               + "text-decoration: none;"
               + "border-radius: 10px;"
               + "}");
         pwriter.println(".btn:hover { background: linear-gradient(to right, #0056b3, #007bff); }");
         pwriter.println("</style>");
         pwriter.println("</head>");

         pwriter.println("<body>");
         pwriter.println("<div class='card'>");
         pwriter.println("<h2>Passenger Details</h2>");
         pwriter.println("<p><strong>Name:</strong> " + myName + "</p>");
         pwriter.println("<p><strong>Password:</strong> " + myPass + "</p>");
         pwriter.println("<a href='Sessionlogin.html' class='btn'>Logout</a>");
         pwriter.println("</div>");
         pwriter.println("</body>");
         pwriter.println("</html>");

         pwriter.close();
      } catch (Exception exp) {
         System.out.println(exp);
      }
   }
}
