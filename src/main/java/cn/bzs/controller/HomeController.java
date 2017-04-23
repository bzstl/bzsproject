package cn.bzs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bzs.service.CONTRACTService;

@Controller
public class HomeController {
	@Autowired
	private CONTRACTService cs; 
	
	@RequestMapping("/home")
	public String home(Model model,HttpServletRequest request){
		
		/*Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(request.getParameter("username"),request.getParameter("password"));
		subject.login(token);
		if (subject.isAuthenticated()) {
			System.out.println("hello");
			CONTRACT obj = cs.find("0313f2b2-cb26-4138-ba1f-f070c933d19c");
			request.setAttribute("obj", obj);
			return "home";
		}
		return "redirect:login";*/
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		
		//�����½ʧ�ܴ�request�л�ȡ��֤�쳣��Ϣ��shiroLoginFailure����shiro�쳣���ȫ�޶���
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		//����shiro���ص��쳣��·���жϣ��׳�ָ���쳣��Ϣ
		System.out.println(exceptionClassName);

		
		return "login";
	}
}
