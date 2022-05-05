package pl.coderslab;

import pl.coderslab.UserDao.UserDao;
import pl.coderslab.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/user/show")
public class UserShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        User selectUser = userDao.read(Integer.parseInt(id));
        request.setAttribute("user", selectUser);

        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);
    }
}