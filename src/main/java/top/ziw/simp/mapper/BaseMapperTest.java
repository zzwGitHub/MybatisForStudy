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

import top.ziw.simp.model.SysUser;

public class BaseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void init() {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ignore) {
			ignore.printStackTrace();
		}
	}

	private void test2(){
		System.out.println("12123");
	}

	private void test3(){
		System.out.println("12123");
	}

//	@Test 
//	public void testAutoMapper() {		
//		SqlSession sqlSession =sqlSessionFactory.openSession( );
//		try { 
//			SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class); 
//			List<test.model.SysUser> users = userMapper.selectAll();
////			List<SysUser> users = userMapper.testInt(1);
//			System.out.println(users.size()); 
//		}finally { //不要忘记关闭 sqlSession 
//		  sqlSession.close(); 
//		}
//	}
	
	
//	@Test
//	public void testSelectAll() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			List<Country> countryList = sqlSession.selectList("top.ziw.simp.mapper.CountryMapper.selectAll");
//			// printCountryList(countryList);
//			System.out.println(countryList);
//		} finally {
//			// 不要忘记关闭 sqlSession
//			sqlSession.close();
//		}
//	}

//	@Test 
//	public void testUserMapper() {		
//		SqlSession sqlSession =sqlSessionFactory.openSession( );
//		try { 
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
//			List<SysUser> users = userMapper.testAll();
////			List<SysUser> users = userMapper.testInt(1);
//			System.out.println(users.size()); 
//		}finally { //不要忘记关闭 sqlSession 
//		  sqlSession.close(); 
//		}
//	}
	
//	public static String tep() {
//		System.out.println("teteetetp");
//		return "123131ff";
//	}
	
//	 
//	@Test 
//	public void testUserInsert() { 
//		SqlSession sqlSession =sqlSessionFactory.openSession( );
//	  
//		try { 
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
//			
//			SysUser user = new SysUser();
//			user.setCreateTime(new Date());
//			user.setUserEmail("8uhihbjkio9ui@11.com");
//			user.setUserInfo("info");
//			user.setUserName("ddddddddd");
//			user.setUserPassword("1111");
//			
//			int a = userMapper.insert2(user);
//			System.out.println("aaaaaaaaaaa" + a); 
//		}finally { 
//			
////			sqlSession.commit();
//			
//			//不要忘记关闭 sqlSession 
//			sqlSession.close(); 
//		}
//	  
//	}
	 
//	@Test 
//	public void testUserUpdateMapper() { 
//		SqlSession sqlSession =sqlSessionFactory.openSession( );
//	  
//		try { 
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
//			
//			SysUser sysuser =  new SysUser();
//			sysuser.setId(1l);
//			sysuser.setUserPassword("123131ff");
//			
//			int num = userMapper.updateByIdSelective2(sysuser);
//			System.out.println(num); 
//		}finally { //不要忘记关闭 sqlSession 
//			sqlSession.commit();
//		  sqlSession.close(); 
//		}
//	  
//	}

}
