package cn.tpson.springboot.controller;

import cn.tpson.springboot.pojo.City;
import cn.tpson.springboot.service.CityServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    CityServcie cityService;

    @RequestMapping("/list")
    public String list(Model map){
        List<City> list= cityService.findAll();
        map.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("list/{id}")
    public String getOne(@PathVariable("id") Integer id,Model map){
        City city = cityService.getOne(id);
        map.addAttribute("city",city);
        return "one";
    }
    @RequestMapping("add")
    public String add(@ModelAttribute City city,Model map){
      String sucess =   cityService.add(city);
      map.addAttribute("msg",sucess);
        return "addpage";
    }

    @RequestMapping("/addpage")
    public String addpage(){
        return "addpage";
    }
}
