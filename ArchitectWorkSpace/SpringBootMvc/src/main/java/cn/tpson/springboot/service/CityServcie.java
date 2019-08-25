package cn.tpson.springboot.service;

import cn.tpson.springboot.dao.CityReposity;
import cn.tpson.springboot.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServcie {
    @Autowired
    CityReposity cityRepo;
    public List<City> findAll() {
        List<City> list = cityRepo.findAll();
        return list;
    }

    /**
     * @Description:   根据id查询一个元素
     ** @Author:      QuLei
     * @CreateDate:   2019-07-07 09:51
     * @Version:      1.0
     */
    public City getOne(Integer id) {
        return cityRepo.getOne(id);
    }

    public String add(City city) {
        City save = cityRepo.save(city);
        System.out.println(save);
        return "保存成功";
    }
}
