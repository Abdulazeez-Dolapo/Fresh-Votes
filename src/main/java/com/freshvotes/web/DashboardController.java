package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	@GetMapping("/dashboard")
	public String dashboardView () {
		return "dashboard";
	}
}
