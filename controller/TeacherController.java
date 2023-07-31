package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.Teacher;
import ru.gb.oop.seminario4.service.TeacherService;
import ru.gb.oop.seminario4.view.TeacherView;
import ru.gb.oop.seminario4.view.UserViewInterface;


import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private UserViewInterface teachersView = new TeacherView();

    private TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, Long teacherId) {
        teacherService.create(firstName, secondName, teacherId);
    }
    public void printConsole(List<Teacher> teachers){
        teachersView.sendOnConsole(teachers);
    }


    public void getAllTeacher(){
        teachersView.sendOnConsole(teacherService.getTeacherGroup());
    }


}
