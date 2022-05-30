package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 서비스 매서드 호출 : super.service(req, resp);

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request); //request = org.apache.catalina.connector.RequestFacade@7ed35bd2
        System.out.println("response = " + response); //response = org.apache.catalina.connector.ResponseFacade@65c6cc5b

        String username = request.getParameter("username");
        //http://localhost:8080/hello?username=kim request로 query를 쉽게 읽어올 수 있다
        System.out.println("username = " + username); //username = kim

        //응답 메세지를 보내보자
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello" + username);
    }
}
