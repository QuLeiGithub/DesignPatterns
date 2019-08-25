package cn.tpson.springboot.dao;

import cn.tpson.springboot.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityReposity extends JpaRepository<City,Integer> {
}
