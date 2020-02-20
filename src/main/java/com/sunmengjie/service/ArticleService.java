package com.sunmengjie.service;

import java.util.List;

import com.sunmengjie.entity.Article;
import com.sunmengjie.entity.Sun;

public interface ArticleService {

	List<Article> list(Sun sun);

}
