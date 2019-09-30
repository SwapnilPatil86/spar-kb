package com.spar.kb.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Article {
	
	public Article() {
		
	}
	
	private Integer articleId;
	private String articleName;
	private String description;
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
