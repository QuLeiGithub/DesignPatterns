package cn.tpson.springbootmybatis.mapper;

import cn.tpson.springbootmybatis.pojo.Menu;
import cn.tpson.springbootmybatis.pojo.MenuExample;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */
@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}