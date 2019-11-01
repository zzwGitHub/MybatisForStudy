package top.ziw.simp.mapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import top.ziw.simp.model.Country;
import top.ziw.simp.model.SysUser;

public class BaseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void init() {
		try {
			Reader reader = Resources.getResourceAsReader("my2.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ignore) {
			ignore.printStackTrace();
		}
	}

	@Test
	public void testSelectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<Country> countryList = sqlSession.selectList("Test11.selectAll");
			// printCountryList(countryList);
			System.out.println(countryList);
		} finally {
			// 不要忘记关闭 sqlSession
			sqlSession.close();
		}
	}

	@Test 
	public void testUserMapper() { 
		SqlSession sqlSession =sqlSessionFactory.openSession( );
	  
		try { 
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
			SysUser user = userMapper.selectById(1l); 
			System.out.println(user.toString()); 
		}finally { //不要忘记关闭 sqlSession 
		  sqlSession.close(); 
		}
	  
	}
	 
		

}
