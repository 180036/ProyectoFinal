package com.web.skins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class skinsController {
	@GetMapping(value = "/")
	public String inicio() {
		return "index";
	}
	@GetMapping(value = "/secured")
	public String secured() {
		return "prototipoInicio_1";
	}
}
