package com.filatovilia.spring.springboot.springbootapp.service;

import com.filatovilia.spring.springboot.springbootapp.model.Role;
import java.util.List;

public interface RoleService {

    List<Role> getAllRole();
    void addRole(Role role);
    void updateRole(Role role);
    void deleteRole(long id);
    Role getRoleByName(String name);
}
