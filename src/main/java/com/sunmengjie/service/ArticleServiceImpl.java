package com.sunmengjie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sunmengjie.entity.Article;
import com.sunmengjie.entity.Sun;
import com.sunmengjie.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;
	
	@Override
	public List<Article> list(Sun sun) {
		
		
		return articleMapper.list(sun);
	}
}
