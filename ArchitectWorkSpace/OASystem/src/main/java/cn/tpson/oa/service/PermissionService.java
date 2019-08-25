package cn.tpson.oa.service;

import cn.tpson.oa.mapper.PermissionExample;
import cn.tpson.oa.mapper.PermissionMapper;
import cn.tpson.oa.pojo.Account;
import cn.tpson.oa.pojo.Permission;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    PermissionMapper mapper;
    public PageInfo<Permission> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PermissionExample example = new PermissionExample();
        List<Permission> list = mapper.selectByExample(example);
        return new PageInfo(list);
    }

    public Permission findById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void update(Permission p) {
        //PermissionExample example = new PermissionExample();
        mapper.updateByPrimaryKeySelective(p);
    }
    public void add(Permission p) {
        //PermissionExample example = new PermissionExample();
        mapper.insert(p);
    }

    public List<Permission> findAll() {
        PermissionExample example = new PermissionExample();
        return mapper.selectByExample(example);
    }
}
