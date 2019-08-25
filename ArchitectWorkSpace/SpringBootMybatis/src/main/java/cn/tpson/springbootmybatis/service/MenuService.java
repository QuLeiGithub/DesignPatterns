package cn.tpson.springbootmybatis.service;

import cn.tpson.springbootmybatis.mapper.MenuMapper;
import cn.tpson.springbootmybatis.pojo.Menu;
import cn.tpson.springbootmybatis.pojo.MenuExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;
    public List<Menu> findAll() {
        MenuExample example = new MenuExample();
        example.createCriteria();
        return menuMapper.selectByExample(example);
    }

    public int add() {
        Menu menu = new Menu();
        menu.setIndext("2");
        menu.setName("资料下载");
        menu.setRoles("all");
       return menuMapper.insert(menu);
    }

    public Menu findById(Integer id) {
        /*MenuExample example = new MenuExample();
        example.createCriteria().andIdEqualTo(id);
        List<Menu> list = menuMapper.selectByExample(example);
        return list.size() == 1 ? list.get(0) : null;*/

        return menuMapper.selectByPrimaryKey(id);
    }

    public List<Menu> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        MenuExample example = new MenuExample();
        return menuMapper.selectByExample(example);
    }
}
