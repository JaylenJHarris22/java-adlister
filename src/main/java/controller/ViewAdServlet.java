package controller;

import dao.DaoFactory;
import modal.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "controller.ViewAdServlet", urlPatterns = "/ads")
public class ViewAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ad> allAds = DaoFactory.getAdsDao().all();
        req.setAttribute("ads", allAds);
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);

    }

}
