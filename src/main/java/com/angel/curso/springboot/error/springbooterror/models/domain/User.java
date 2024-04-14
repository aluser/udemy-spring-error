package com.angel.curso.springboot.error.springbooterror.models.domain;

public class User {
    private String name;
    private String lastname;
    private Long id;

    private Role role;
   
    public User() {
    }

    public User(String name, String lastname, Long id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        //this.role = new Role();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    /*public String getRoleName() {
        return role.getName();
    }*/
}
