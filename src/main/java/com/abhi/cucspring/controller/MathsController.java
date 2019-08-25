package com.abhi.cucspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.cucspring.entity.MathResult;

@RestController
public class MathsController {

	@GetMapping("/api/add")
	@ResponseBody
	public MathResult addNumbers(@RequestParam(name = "numberOne", required = true, defaultValue = "0") int one,
			@RequestParam(name = "numberTwo", required = true, defaultValue = "0") int two) {
		return new MathResult((one+two));
	}
}
