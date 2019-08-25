package cn.tpson.springbootmybatis.mapper;

import cn.tpson.springbootmybatis.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface AccountMapper {
    List<Account> findAll();
    int saveAccount(Account account);
}
