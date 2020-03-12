package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Article;

public class ArticleDaoMariaDb implements ArticleDao{
	
	MariaDbConnection mariaDbConn;
	
	public ArticleDaoMariaDb(MariaDbConnection mariaDbConn) {
		this.mariaDbConn = mariaDbConn;
	}
	public ArticleDaoMariaDb() {
		this(new MariaDbConnection());
	}
	
	@Override
	public void save(Article article) {
		Connection con = mariaDbConn.open();
		String sql = "INSERT INTO article_art (art_name, art_text, art_img, art_visitor_count) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, article.getName());
			ps.setString(2, article.getText());
			ps.setString(3, article.getImg());
			ps.setInt(4, article.getVisitorCount());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Article article) {
		Connection con = mariaDbConn.open();
		String sql = "UPDATE article_art SET (art_name, art_text, art_img, art_visitor_count) VALUES (?,?,?,?) where art_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, article.getName());
			ps.setString(2, article.getText());
			ps.setString(3, article.getImg());
			ps.setInt(4, article.getVisitorCount());
			ps.setInt(5, article.getId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Article findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Article article) {
		// TODO Auto-generated method stub
		
	}

}
