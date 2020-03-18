package db;

import beans.Author;

public interface AuthorDao {
	public void save(Author author);
	public void update(Author author);
	public Author findById(int id);
	public Author findByName(String name);
	public void delete(Author author);
}
