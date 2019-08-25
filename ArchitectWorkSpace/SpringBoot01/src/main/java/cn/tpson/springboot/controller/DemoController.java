package cn.tpson.springboot.controller;

import cn.tpson.springboot.domain.City;
import cn.tpson.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoController {
    @Autowired
    private  CityService cityService;

    @RequestMapping("/list")
    public String list(Model map){
        List<City> list = cityService.findAll();
        map.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/add")
    public String add(@ModelAttribute City city,ModelMap map){
       String success =  cityService.add(city);
        System.out.println(success);
        map.addAttribute("msg",success);
        return "addpage";
    }

    @RequestMapping("/addpage")
    public String addpage(){
        return "addpage";
    }
}

