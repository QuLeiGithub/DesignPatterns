package cn.tpson.oa.mapper;

import cn.tpson.oa.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * AccountMapper继承基类
 */
@Mapper
public interface AccountMapper extends MyBatisBaseDao<Account, Integer, AccountExample> {
    List<Account> selectByPer();

    Account findByLoginNameAndPassword(String loginName, String password);
}