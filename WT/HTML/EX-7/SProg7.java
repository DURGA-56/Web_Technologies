/* Session Example - Smart Airport Guide */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg7 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            response.setContentType("text/html");
            PrintWriter pwriter = response.getWriter();

            String name = request.getParameter("userName");
            String password = request.getParameter("userPassword");

            pwriter.println("<!DOCTYPE html>");
            pwriter.println("<html lang='en'>");
            pwriter.println("<head>");
            pwriter.println("<meta charset='UTF-8'>");
            pwriter.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            pwriter.println("<title>Smart Airport Guide</title>");
            
            // Embedded CSS with background image
            pwriter.println("<style>");
            pwriter.println("body { "
                    + "font-family: 'Poppins', sans-serif; "
                    + "margin: 0; padding: 0; "
                    + "background: url('https://images.unsplash.com/photo-1513002749550-c59d786b8e6c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c2t5fGVufDB8fDB8fHww&fm=jpg&q=60&w=3000') no-repeat center center fixed; "
                    + "background-size: cover; "
                    + "}"); 
            pwriter.println(".container { "
                    + "max-width: 500px; "
                    + "margin: 80px auto; "
                    + "background: rgba(255, 255, 255, 0.95); " // slightly transparent card
                    + "padding: 40px; "
                    + "box-shadow: 0 8px 16px rgba(0,0,0,0.2); "
                    + "border-radius: 12px; "
                    + "text-align: center; "
                    + "}"); 
            pwriter.println("h3 { color: #333; font-size: 28px; margin-bottom: 20px; }");
            pwriter.println("p { font-size: 18px; color: #555; margin-bottom: 30px; }");
            pwriter.println(".btn { "
                    + "display: inline-block; "
                    + "padding: 12px 25px; "
                    + "background: #007bff; "
                    + "color: white; "
                    + "text-decoration: none; "
                    + "font-size: 16px; "
                    + "border-radius: 8px; "
                    + "transition: background 0.3s; "
                    + "}");
            pwriter.println(".btn:hover { background: #0056b3; }");
            pwriter.println("</style>");
            pwriter.println("</head>");

            pwriter.println("<body>");
            pwriter.println("<div class='container'>");
            pwriter.println("<h3>Welcome, " + name + "!</h3>");
            pwriter.println("<p>Your password is: <strong>" + password + "</strong></p>");

            // Create session and store values
            HttpSession session = request.getSession();
            session.setAttribute("uname", name);
            session.setAttribute("upass", password);

            pwriter.println("<a href='SProg8' class='btn'>View Details</a>");
            pwriter.println("</div>");
            pwriter.println("</body></html>");

            pwriter.close();

        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
