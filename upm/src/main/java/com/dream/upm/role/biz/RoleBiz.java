package com.dream.upm.role.biz;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dream.upm.role.domain.Role;

public interface RoleBiz {

    /**
     * 查询
     *
     * @param page
     * @return
     */
    IPage selectPage(Page page);

    /**
     * 新增角色
     *
     * @param role
     * @return
     */
    int add(Role role);

    /**
     * 更新角色
     *
     * @param role
     * @return
     */
    int update(Role role);

    /**
     * 删除角色
     *
     * @param role
     * @return
     */
    int delete(Role role);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    Role selectById(Long id);
}
