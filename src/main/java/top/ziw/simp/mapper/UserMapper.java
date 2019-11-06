package top.ziw.simp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import top.ziw.simp.model.SysUser;

public interface UserMapper {

	SysUser selectById(Long id);
	
	int insert2(SysUser user);
	
	@Select({"select * from sys_user where id = #{id}"})
	SysUser selectByIdA(Long id);
	
	int updateByIdSelective2(SysUser sysuser);
	
	List<SysUser> selectLike(@Param("string")String string);
	
	List<SysUser> testBind(@Param("string")String string);
	List<SysUser> testString(String string);
	List<SysUser> testInt(@Param("f")int ng);
	List<SysUser> testAll();
}
