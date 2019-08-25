package cn.tpson.springboot.service;

import cn.tpson.springboot.dao.CityDao;
import cn.tpson.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityDao cityDao;
    public List<City> findAll() {
       return  cityDao.findAll();
    }

    public String add(Integer id, String name) {
        City city = new City(id, name);
        try {
            cityDao.save(city);
        } catch (Exception e) {
            return "保存失败";
        }
        return "保存成功";
    }

    public String add(City city) {
        try {
            cityDao.save(city);
        } catch (Exception e) {
            return "保存失败";
        }
        return "保存成功";
    }
}
