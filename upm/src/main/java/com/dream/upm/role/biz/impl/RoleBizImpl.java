package com.dream.upm.role.biz.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dream.upm.role.biz.RoleBiz;
import com.dream.upm.role.domain.Role;
import com.dream.upm.role.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleBizImpl implements RoleBiz {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public IPage selectPage(Page page) {
        return null;
    }

    @Override
    public int add(Role role) {
        role.setId(UUID.randomUUID().toString());
        return roleMapper.insert(role);
    }

    @Override
    public int update(Role role) {
        return roleMapper.updateById(role);
    }

    @Override
    public int delete(Role role) {
        role.setRecStatus(1);
        return roleMapper.updateById(role);
    }

    @Override
    public Role selectById(Long id) {
        return roleMapper.selectById(id);
    }
}
