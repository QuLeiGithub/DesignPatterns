package cn.tpson.springboot.dao;

import cn.tpson.springboot.domain.City;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CityDao {
   static Map<Integer,City> cityMap =  Collections.synchronizedMap(new HashMap<>());
    /**
     * 在内存中虚拟一份数据出来
     * @return
     */
    public List<City> findAll() {
        return new ArrayList<>(cityMap.values());
    }


    public void save(City city) throws Exception {
        City city1 = cityMap.get(city.getId());
        if(city1 != null){
            throw new Exception("数据已存在！！！！");
        }
        cityMap.put(city.getId(),city);
    }
}
