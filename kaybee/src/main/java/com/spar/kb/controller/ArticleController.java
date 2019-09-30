package com.spar.kb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spar.kb.model.Article;

@RestController
public class ArticleController {
	
	@RequestMapping(method=RequestMethod.GET, value="/article")
	public Article getArticle() {
		return new Article();
	}

}
