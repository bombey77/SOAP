package servlet_run_example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import java.io.IOException;

@WebServlet("helloWorldService")
public class NewRunner extends HttpServlet {

    @WebServiceRef
    HelloWorld helloWorld;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(helloWorld.sayHelloWorld());
    }
}
