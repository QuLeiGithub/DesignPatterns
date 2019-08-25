package cn.tpson.oa.mapper;

import cn.tpson.oa.pojo.Permission;
import cn.tpson.oa.mapper.PermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PermissionMapper继承基类
 */
@Mapper
public interface PermissionMapper extends MyBatisBaseDao<Permission, Integer, PermissionExample> {
}