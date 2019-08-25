package cn.tpson.springbootmybatis.controller;

import cn.tpson.springbootmybatis.pojo.Account;
import cn.tpson.springbootmybatis.pojo.Menu;
import cn.tpson.springbootmybatis.service.AccountService;
import cn.tpson.springbootmybatis.service.MenuService;
import cn.tpson.springbootmybatis.state.RespState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private MenuService menuService;
    @RequestMapping("/menuList")
    @ResponseBody
    public Object  menuList(){
        List<Menu> menuList = menuService.findAll();
        System.out.println(menuList);
        return menuList;
    }

    @RequestMapping("/menuOne/{id}")
    @ResponseBody
    public Object  menuOne(@PathVariable Integer id ){
        Menu menu = menuService.findById(id);
        System.out.println(menu);
        return menu;
    }

    @RequestMapping("/page")
    @ResponseBody
    public Object  pageQuery(@RequestParam Integer pageNum,@RequestParam Integer pageSize ){
        List<Menu> pageList = menuService.findByPage(pageNum,pageSize);
        System.out.println(pageList);
        return pageList;
    }


    @RequestMapping("/addMenu")
    public String add(){
        int index = menuService.add();
        return "menu";
    }


    @RequestMapping("/list")
    @ResponseBody
    public List<Account> list(){
        List<Account> list = accountService.findAll();
        System.out.println(list);
        return list;
    }


    @RequestMapping("/find")
    @ResponseBody
    public Object findOne(){
       List<Account> list =  accountService.findBetween(1,4);
        System.out.println(list);
        return list;
    }


    /**
    @Description: 加载注册页面
    * @author      QuLei
    * @return     页面的逻辑地址
    * @exception
    * @date        2019-07-08 23:02
    */
    @GetMapping("/register")
    public String register(){
        return "register";
    }


    @PostMapping("/register")
    public String registerP(@ModelAttribute Account account, Model model){
        System.out.println(account);
        int index =  accountService.save(account);
        if(index != 0) {
            System.out.println(index);
            RespState state = new RespState();
            model.addAttribute("state","注册成功！！！");
        }
        return "register";
    }
    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }

    @PostMapping("login")
    public String loginP(){
        return "success";
    }
}
