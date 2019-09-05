package com.dream.upm.role.controller;

import com.dream.upm.role.biz.RoleBiz;
import com.dream.upm.role.domain.Role;
import com.dream.upm.utils.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/upm/role")
public class RoleController {

    @Autowired
    private RoleBiz roleBiz;

    @PostMapping()
    public ResultMessage add(Role role) {
        try {
            roleBiz.add(role);
            return ResultMessage.success("操作成功");
        } catch (Exception e) {
            return ResultMessage.fail("操作失败");
        }
    }


    @PutMapping()
    public ResultMessage update(Role role) {
        try {
            roleBiz.update(role);
            return ResultMessage.success("操作成功");
        } catch (Exception e) {
            return ResultMessage.fail("操作失败");
        }
    }

    @DeleteMapping("/{id}")
    public ResultMessage delete(@PathVariable Long id) {
        try {
            Role role = roleBiz.selectById(id);
            roleBiz.delete(role);
            return ResultMessage.success("操作成功");
        } catch (Exception e) {
            return ResultMessage.fail("操作失败");
        }
    }

}
