package cn.tpson.oa.controller.rest;

import cn.tpson.oa.pojo.Permission;
import cn.tpson.oa.service.PermissionService;
import cn.tpson.oa.util.RespState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manager/permission")
public class ManagerRestController {
    @Autowired
    PermissionService permissionService;
    @PostMapping("add")
    @ResponseBody
    public RespState add(@RequestBody Permission p){
        if(p.getId() == null){
            permissionService.add(p);
        }else{
            permissionService.update(p);
        }
        return RespState.build(200);
    }

    @RequestMapping("update")
    @ResponseBody
    public RespState update(@RequestBody Permission p){
        permissionService.update(p);
        return RespState.build(200);
    }
}
