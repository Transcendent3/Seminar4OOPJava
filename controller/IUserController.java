package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.User;

/**
 * Принцип единственной ответственности, данный интерфейс выполняет только одну функцию создать юзера.
 * Принцип разделения интерфейса (ISP)
 */
public interface IUserController <T extends User>{
    void create(String firstName, String surName, String lastName);
}
