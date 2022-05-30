package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {
    //회원 저장, 리스트보기 등등의 컨트롤러를 '모두' 볼수있게 컨트롤러를 구성해보자
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
