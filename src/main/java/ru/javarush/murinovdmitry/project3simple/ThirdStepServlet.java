package ru.javarush.murinovdmitry.project3simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/third_step")
public class ThirdStepServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String choice = req.getParameter("choice");

        if ("travel".equals(choice)) {
            req.getRequestDispatcher("/steps/thirdStepTravel.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/steps/thirdStepStay.jsp").forward(req, resp);
        }
    }
}
