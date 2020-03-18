package db;

import beans.Tag;

public interface TagDao {
	public void save(Tag tag);
	public void update(Tag tag);
	public Tag findById(int id);
	public Tag findByAuthor(String name);
	public void delete(Tag tag);
}
