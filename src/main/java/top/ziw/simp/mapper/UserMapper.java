package top.ziw.simp.mapper;

import org.apache.ibatis.annotations.Select;

import top.ziw.simp.model.SysUser;

public interface UserMapper {

	SysUser selectById(Long id);
	
	int insert2(SysUser user);
	
	@Select({"select * from sys_user where id = #{id}"})
	SysUser selectByIdA(Long id);
}
