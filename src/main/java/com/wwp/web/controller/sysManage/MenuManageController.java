package com.wwp.web.controller.sysManage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwp.web.service.impl.MenuService;

@Controller
@RequestMapping("menu")
public class MenuManageController {

	@Autowired
	private MenuService menuService;
	
	
	
}
