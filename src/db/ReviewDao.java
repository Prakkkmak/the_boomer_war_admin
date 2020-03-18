package db;

import beans.Review;

public interface ReviewDao {
	public void save(Review review);
	public void update(Review review);
	public Review findById(int id);
	public Review findByAuthor(String name);
	public void delete(Review review);
}
