package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	@RequestMapping("/")
	public String idex() {
		System.out.println("Chamou  método index");
		return "homes";
	}
}
