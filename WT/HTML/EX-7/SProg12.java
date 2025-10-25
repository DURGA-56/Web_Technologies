/* SKYPORT GUIDE - URL REWRITING PART 2 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg12 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        out.println("<html><head><meta charset='UTF-8'><title>SkyPort Services</title></head>");
        out.println("<style>");
        out.println("body { background: url('https://e1.pxfuel.com/desktop-wallpaper/261/759/desktop-wallpaper-kempegowda-international-airport-hok-bangalore-airport.jpg') no-repeat center center fixed;");
        out.println("background-size: cover; font-family: Arial; text-align: center; color: #333; padding-top: 100px; }");
        out.println(".content { background: rgba(255,255,255,0.9); display: inline-block; padding: 30px 50px; border-radius: 15px; }");
        out.println("ul { list-style-type: none; padding: 0; font-size: 18px; text-align: left; display: inline-block; }");
        out.println("li { margin: 10px 0; border-left: 4px solid #0078D7; padding-left: 10px; }");
        out.println("</style></head><body>");

        out.println("<div class='content'>");
        out.println("<h2>Hello " + name + "!</h2>");
        out.println("<h3>Available Airport Services:</h3>");
        out.println("<ul>");
        out.println("<li>✈ Flight Information Display</li>");
        out.println("<li>🧳 Baggage Tracking Service</li>");
        out.println("<li>🍴 Food & Lounge Locator</li>");
        out.println("<li>🚕 Taxi & Shuttle Booking</li>");
        out.println("<li>💳 Smart Payment & Assistance</li>");
        out.println("</ul>");
        out.println("<p>Thank you for choosing SkyPort Guide, " + name + "!</p>");
        out.println("</div></body></html>");
    }
}
