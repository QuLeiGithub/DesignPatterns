package cn.tpson.oa.service;

import cn.tpson.oa.mapper.AccountExample;
import cn.tpson.oa.mapper.AccountMapper;
import cn.tpson.oa.pojo.Account;
import cn.tpson.oa.util.MD5Util;
import cn.tpson.oa.util.RespState;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService{
    @Autowired
    AccountMapper mapper;

    public Account findByLoginNameAndPassword(String loginName, String password) {
        /*AccountExample example = new AccountExample();
        example.createCriteria().andLoginNameEqualTo(loginName)
                .andPasswordEqualTo(password);*/
        return mapper.findByLoginNameAndPassword(loginName,password);
    }
    /**
    @Description:  查询所有用户分页
    * @author      QuLei

    * @return
    * @exception
    * @date        2019-07-13 21:14
    */
    public PageInfo<Account> findByPage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        AccountExample example = new AccountExample();
        List<Account> list = mapper.selectByExample(example);
        List<Account> accountList = mapper.selectByPer();
        return new PageInfo<>(list);
    }

    public RespState deleteById(int id) {
        int row = mapper.deleteByPrimaryKey(id);
        if(row == 1){
            return RespState.build(200);
        }

        return  RespState.build(500,"删除失败！！！");
    }

    public RespState register(Account account) {
        account.setPassword(MD5Util.md5(account.getPassword()));
        account.setRole("user");
        try {
            int index = mapper.insert(account);
            if(index == 1){
                return RespState.build(200);
            }
            return RespState.build(500,"注册失败！！！");
        }catch (Exception e){
            return RespState.build(500,"注册失败！！！");
        }


    }

    public RespState modify(Account account) {
        try {
            int index = mapper.updateByPrimaryKeySelective(account);
            if(index == 1){
                return RespState.build(200);
            }
            return RespState.build(500,"修改失败！！！");
        }catch (Exception e){
            return RespState.build(500,"修改失败！！！");
        }
    }
}
