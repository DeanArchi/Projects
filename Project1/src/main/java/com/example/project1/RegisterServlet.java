package com.example.project1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("secondName");
        String age = req.getParameter("age");
        Stat.list.add(new Person(firstName, secondName, age));
        String color = req.getParameter("color");
        if(color.equals("blue")) {
            Stat.blue.getAndIncrement();
        }
        if(color.equals("yellow")) {
            Stat.yellow.getAndIncrement();
        }
        if(color.equals("red")) {
            Stat.red.getAndIncrement();
        }
        String quiz = req.getParameter("quiz");
        if(quiz.equals("yes")) {
            Stat.yes.getAndIncrement();
        }
        if(quiz.equals("no")){
            Stat.no.getAndIncrement();
        }

        req.setAttribute("blue", Stat.blue);
        req.setAttribute("yellow", Stat.yellow);
        req.setAttribute("red", Stat.red);
        req.setAttribute("yes", Stat.yes);
        req.setAttribute("no", Stat.no);

        getServletContext().getRequestDispatcher("/stat.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);
    }
}
