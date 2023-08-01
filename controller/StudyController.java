package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.Student;
import ru.gb.oop.seminario4.data.Teacher;
import ru.gb.oop.seminario4.data.User;
import ru.gb.oop.seminario4.service.StudyGroupService;

import java.util.List;

public class StudyController {
    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudyGroup(Teacher teacher, List<User> students){
        studyGroupService.createStudyGroup(teacher, students);
    }
    public void getStudyGroupId(){
        List<User> userList = studyGroupService.getStudentList();
        for (User user: userList) {
            Student student = (Student) user;
            System.out.println("StudentId: " + student.getStudentId());
        }
    }
    public void getTeacherId(){
        studyGroupService.getTeacher();
    }
}
