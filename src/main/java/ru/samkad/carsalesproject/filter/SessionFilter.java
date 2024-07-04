package ru.samkad.carsalesproject.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.samkad.carsalesproject.entity.User;

import java.io.IOException;

@Component
@Order(2)
public class SessionFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response,
                            FilterChain chain) throws IOException, ServletException {
        HttpSession session = request.getSession();

    }

    private void addUserToSession(HttpSession session, HttpServletRequest request) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setId(-1);
            user.setName("Гость");
        }
        request.setAttribute("user", user);
    }
}
