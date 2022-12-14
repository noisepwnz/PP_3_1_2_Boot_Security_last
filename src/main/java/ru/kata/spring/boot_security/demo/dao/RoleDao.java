package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

public interface RoleDao {
    void addRole(Role role);

    Role getRoleByName(String name);

    Set<Role> getAllRoles();

    public Set<Role> getRolesByName(Set<Role> roles);
}
