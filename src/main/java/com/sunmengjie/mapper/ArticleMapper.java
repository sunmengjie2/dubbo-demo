package com.sunmengjie.mapper;

import java.util.List;

import com.sunmengjie.entity.Article;
import com.sunmengjie.entity.Sun;

public interface ArticleMapper {

	List<Article> list(Sun sun);

	
}
