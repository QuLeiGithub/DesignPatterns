package cn.tpson.ssm.controller;

import cn.tpson.ssm.pojo.Account;
import cn.tpson.ssm.service.AccountService;
import cn.tpson.ssm.state.RespState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private AccountService accountService;


    @RequestMapping("/list")
    @ResponseBody
    public Object list(){
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
        Account entity =  accountService.save(account);
        if(entity.getId() != 0) {
            System.out.println(entity);
            RespState state = new RespState();
            model.addAttribute("state",state);
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
