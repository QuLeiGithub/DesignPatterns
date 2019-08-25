package cn.tpson.oa.mapper;

import cn.tpson.oa.pojo.Role;
import cn.tpson.oa.mapper.RoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * RoleMapper继承基类
 */
@Mapper
public interface RoleMapper extends MyBatisBaseDao<Role, Integer, RoleExample> {
    void addPermission(Integer id, Integer[] permissions);

    Role findById(int id);
}