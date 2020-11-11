package com.rehansqapoint.oops.interfaces;

public class User implements UserModuleImpl,Autororization{
    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public void addUser() {
        System.out.println("adding user");
    }

    @Override
    public void searchUser() {
        System.out.println("get user deatiks");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");
    }

    @Override
    public void updateUser() {
        System.out.println("update user");
    }

    @Override
    public void oAuth() {
        System.out.println("oAuth");
    }
}
