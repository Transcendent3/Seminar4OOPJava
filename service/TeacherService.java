package ru.gb.oop.seminario4.service;

import ru.gb.oop.seminario4.data.Teacher;



import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList;
    public void create(String firstName, String secondName, Long teacherId){
        Teacher teacher = new Teacher(firstName, secondName, teacherId);
        teacherList.add(teacher);
    }
    public List<Teacher> getTeacherGroup(){
        return teacherList;
    }

}