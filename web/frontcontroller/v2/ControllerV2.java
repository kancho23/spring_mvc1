package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {
    //기존 ControllerV1 interface와 동일하게 가져온다. 단 반환만 MyView로
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}