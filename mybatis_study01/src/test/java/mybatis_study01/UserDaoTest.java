package mybatis_study01;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import UserDao.UserDao;

public class UserDaoTest {
	
	private UserDao userDao;
	private SqlSession sqlSession;
	

	@Before
	public void setUp() throws Exception {
		String resource = "mybatis-config.xml";
		
		InputStream is = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		sqlSession = sqlSessionFactory.openSession();
		
		userDao = sqlSession.getMapper(UserDao.class);
		
	}

	@Test
	public void testSelectCount() {
	}

	@Test
	public void testUserDaoImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryUserById() {
		User user = userDao.queryUserById(1l);
		System.out.println(user);
	
	}

	@Test
	public void testQueryAllUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUserById() {
		fail("Not yet implemented");
	}

}
