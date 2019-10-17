package UserImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import UserDao.UserDao;
import mybatis_study01.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSession SqlSession;
	
	

	@Override
	public Integer selectCount() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDaoImpl(org.apache.ibatis.session.SqlSession sqlSession) {
		super();
		this.SqlSession = sqlSession;
	}

	@Override
	public User queryUserById(Long id) {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("abc.selectUser", id);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return SqlSession.selectList("abc.queryUserAll");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub

	}

}
