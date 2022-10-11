package com.example.project1;

import jakarta.servlet.http.HttpServlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Stat extends HttpServlet {
    public static List<Person> list = Collections.synchronizedList(new ArrayList<>());
    public static AtomicInteger blue = new AtomicInteger(0);
    public static AtomicInteger yellow = new AtomicInteger(0);
    public static AtomicInteger red = new AtomicInteger(0);
    public static AtomicInteger yes = new AtomicInteger(0);
    public static AtomicInteger no = new AtomicInteger(0);

}
