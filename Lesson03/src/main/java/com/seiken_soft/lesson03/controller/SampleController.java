
package com.seiken_soft.lesson03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Springでコントローラーであることを表示
@Controller

//Springでアノテーション変わり
@RequestMapping("/sample")
public class SampleController {
	
	//Getと同じ
	@GetMapping("/test")
	public String index(Model model) {
		
		//getAttributeと同じ
		model.addAttribute("title","Inquiry Form");
		
		//htmlのファイル名
		return "test";
	}

}
