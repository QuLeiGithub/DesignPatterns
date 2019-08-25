package cn.tpson.oa.controller.rest;

import cn.tpson.oa.pojo.Permission;
import cn.tpson.oa.service.PermissionService;
import cn.tpson.oa.service.RoleService;
import cn.tpson.oa.util.RespState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manager/role")
public class RoleManagerRestController {
    @Autowired
    RoleService roleService;

    /**
     * 角色授权
     * @param permissions
     * @param id
     * @return
     */
    @PostMapping("permission/add")
    @ResponseBody
    public RespState permissionadd(@RequestParam Integer permissions [],
                                   @RequestParam int id){
        roleService.addPermission(id,permissions);
        return RespState.build(200);
    }

}
