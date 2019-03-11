package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//@WebServlet(urlPatterns="/welcome")

//public class WellcomeController extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.getRequestDispatcher("/WEB-INF/view/client/view/index.jsp").forward(req, resp);
//	}
//
//}
@Controller
@RequestMapping(value="/home")
public class WellcomeController {
//        @RequestMapping(value="index1",method =RequestMethod.GET)
        @RequestMapping(value = "/index")
        public String index(){
            return "view/client/view/login";
        }

}
