package db;

import beans.Article;

public interface ArticleDao {
	public void save(Article article);
	public void update(Article article);
	public Article findById(int id);
	public void delete(Article article);
}
