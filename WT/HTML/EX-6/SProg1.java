import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SProg1 extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        message = "Welcome aboard SkyPort Guide - Your Smart Airport Companion!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>SkyPort Guide</title>");
        out.println("<style>");
        out.println("body {"
                + "margin: 0;"
                + "height: 100vh;"
                + "display: flex;"
                + "flex-direction: column;"
                + "align-items: center;"
                + "justify-content: center;"
                + "background-image: url('https://www.arup.com/globalassets/images/projects/z/zayed-international-airport-terminal-a/zayed-international-airport-terminal-a.webp?width=1840&height=1035&quality=80');"
                + "background-size: cover;"
                + "background-position: center;"
                + "color: #fff;"
                + "font-family: 'Segoe UI', sans-serif;"
                + "overflow: hidden;"
                + "text-align: center;"
                + "}");

        // floating plane animation
        out.println("@keyframes fly {"
                + "0% { transform: translateX(-200px) translateY(0); }"
                + "50% { transform: translateX(100px) translateY(-20px); }"
                + "100% { transform: translateX(500px) translateY(0); opacity: 0; }"
                + "}");

        // glowing title
        out.println("h1 {"
                + "font-size: 2.5em;"
                + "text-shadow: 2px 2px 20px rgba(0,0,0,0.8);"
                + "animation: glow 2s ease-in-out infinite alternate;"
                + "}");
        out.println("@keyframes glow {"
                + "from { text-shadow: 0 0 10px #00bfff, 0 0 20px #00bfff, 0 0 30px #0099cc; }"
                + "to { text-shadow: 0 0 20px #66ccff, 0 0 30px #3399ff, 0 0 40px #00ccff; }"
                + "}");

        // animated button
        out.println(".btn {"
                + "background-color: rgba(0, 128, 255, 0.8);"
                + "padding: 15px 30px;"
                + "border-radius: 30px;"
                + "font-size: 1.2em;"
                + "color: white;"
                + "cursor: pointer;"
                + "text-decoration: none;"
                + "transition: transform 0.2s, box-shadow 0.2s;"
                + "box-shadow: 0 4px 10px rgba(0,0,0,0.4);"
                + "}");
        out.println(".btn:hover {"
                + "transform: scale(1.1);"
                + "box-shadow: 0 6px 15px rgba(0,0,0,0.6);"
                + "}");

        // plane emoji animation
        out.println(".plane {"
                + "font-size: 40px;"
                + "position: absolute;"
                + "top: 40%;"
                + "left: -100px;"
                + "animation: fly 6s linear infinite;"
                + "}");

        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='plane'>✈️</div>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>Discover real-time flight updates, airport navigation, and traveler support with SkyPort Guide.</p>");
        out.println("<a href='http://localhost:8080/LAB4026/SProg1.html' class='btn'>Back to SkyPort Home</a>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
        // cleanup
    }
}
