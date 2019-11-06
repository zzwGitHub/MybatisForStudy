package test.dao;

import java.util.List;
import test.model.UUser;

public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    UUser selectByPrimaryKey(Long id);

    List<UUser> selectAll();

    int updateByPrimaryKey(UUser record);
}