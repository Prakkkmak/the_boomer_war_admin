package db.mariaImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Article;
import db.ArticleDao;

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
		Article article = null;
		Connection con = mariaDbConn.open();
		String sql = "SELECT * FROM article_art where art_id = ?";
		try {
			article = new Article();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				article.setName(rs.getString("art_name"));
				article.setText(rs.getString("art_text"));
				article.setImg(rs.getString("art_img"));
				article.setVisitorCount(rs.getInt("visitor_count"));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public void delete(Article article) {
		Connection con = mariaDbConn.open();
		String sql = "DELETE FROM article_art WHERE art_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, article.getId());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
