package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "HelloFormServlet",urlPatterns = {"/hello-form","/SayHello"})
public class HelloFormServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int time = Integer.parseInt(request.getParameter("time"));
        String output;
        Map<String,String> messages= new HashMap<String,String>();
        request.setAttribute("messages",messages);


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(time < 12 ){
            output = "Good morning";

        }else if(time >12 && time <17){

            output="Good afternoon";

        }else{

            output ="Good Night";

        }

        if (name == null || name.trim().isEmpty()) {
            messages.put("name", "Please enter name");
        }

        if (surname == null || name.trim().isEmpty()) {
            messages.put("name", "Please enter name");
        }

        if (output == null || name.trim().isEmpty()) {
            messages.put("name", "Please enter name");
        }

        if (messages.isEmpty()) {
            messages.put("success", String.format("%s %s %s!", output,name,surname));
        }



        request.getRequestDispatcher("/SayHello.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/hello-form.jsp").forward(request, response);
    }
}
