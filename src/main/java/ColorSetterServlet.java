import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "ColorSetterServlet", urlPatterns = "/viewcolor")
public class ColorSetterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        req.setAttribute("color", color);
        System.out.println(color);
        req.getRequestDispatcher("/color-shower.jsp").forward(req, resp);
    }

}
