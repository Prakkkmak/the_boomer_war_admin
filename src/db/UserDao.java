package db;

import beans.User;

public interface UserDao {
	public void save(User user);
	public void update(User user);
	public User findById(int id);
	public User findByName(String name);
	public void delete(User user);
}
