package third.spring.lab2_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value = "/home")
	public String home() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest() {
		return "테스트 String";
	}

}
