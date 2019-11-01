package top.ziw.simp.mapper;

import top.ziw.simp.model.SysUser;

public interface UserMapper {

	SysUser selectById(Long id);
}
