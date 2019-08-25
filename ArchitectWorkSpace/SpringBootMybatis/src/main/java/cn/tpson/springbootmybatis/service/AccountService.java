package cn.tpson.springbootmybatis.service;

import cn.tpson.springbootmybatis.mapper.AccountMapper;
import cn.tpson.springbootmybatis.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper mapper;

    public int save(Account account) {
        return mapper.saveAccount(account);
    }

    public List<Account> findAll() {
        return mapper.findAll();
    }

    public List<Account> findBetween(int min,int max){
       return null;
    }
}
