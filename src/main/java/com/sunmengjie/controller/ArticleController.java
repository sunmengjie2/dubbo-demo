package com.sunmengjie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunmengjie.entity.Article;
import com.sunmengjie.entity.Sun;
import com.sunmengjie.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int pageNum,Model model, Sun sun){
		
			System.err.println(sun.getSortName());
		
		PageHelper.startPage(pageNum, 10);
		List<Article> list = articleService.list(sun);
		PageInfo<Article> page = new PageInfo<>(list);
		model.addAttribute("list", list);
		model.addAttribute("sun", sun);
		model.addAttribute("page", page);
		
		
		return "list";
	}
}
