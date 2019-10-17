package UserDao;


import java.util.List;

import mybatis_study01.User;

public interface UserDao {
	public Integer selectCount();
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> queryAllUser();
	
	/**
	 * 添加用户信息
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 根据id删除用户信息
	 * @param id
	 */
	public void deleteUserById(Long id);

}
