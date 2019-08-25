package cn.tpson.oa.service;

import cn.tpson.oa.mapper.RoleExample;
import cn.tpson.oa.mapper.RoleMapper;
import cn.tpson.oa.pojo.Role;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public PageInfo<Role> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        RoleExample example = new RoleExample();
        List<Role> list = roleMapper.selectByExample(example);
        return new PageInfo(list);
    }

    public Role findById(int id) {
        return  roleMapper.findById(id);
    }

    public void addPermission(int id, Integer[] permissions) {
        roleMapper.addPermission(id,permissions);
    }
}
