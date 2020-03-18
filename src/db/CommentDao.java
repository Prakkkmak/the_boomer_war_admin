package db;

import beans.Comment;

public interface CommentDao {
	public void save(Comment comment);
	public void update(Comment comment);
	public Comment findById(int id);
	public Comment findByAuthor(String name);
	public void delete(Comment comment);
}
