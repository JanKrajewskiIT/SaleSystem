package pl.lodz.p.was04.department.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.lodz.p.was04.department.commons.system.SystemInfo;

@Controller
public class MainController {

	@Autowired
	private SystemInfo systemInfo;

	@RequestMapping("/")
	public String main() {
		return "redirect:/system-info";
	}

	@ResponseBody
	@RequestMapping("/system-info")
	public String systemInfo() {
		return systemInfo.getSystemName();
	}
}
