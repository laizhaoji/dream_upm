package com.dream.upm.role.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dream.upm.basic.BasicDomain;

@TableName("upm_role")
public class Role extends BasicDomain {

    private String roleCode;

    private String roleName;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
