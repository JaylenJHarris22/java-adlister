import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet (name = "GuessProcessorServlet", urlPatterns = "/guess")
public class GuessProcessorServlet extends HttpServlet {
    Random random = new Random();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num = req.getParameter("num");
        int x = random.nextInt(3 ) + 1;
        String redi = "";
        int number = Integer.parseInt(num);
//        redi = (x == number) ? resp.sendRedirect("/correct") : resp.sendRedirect("/incorrect");
        if (number == x){
            resp.sendRedirect("/correct");
            System.out.println("correct");
        } else {
            resp.sendRedirect("/incorrect");
            System.out.println("incorrect");
        }
    }
}
