package cn.tpson.oa.mapper;

import cn.tpson.oa.pojo.Menu;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */

@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}