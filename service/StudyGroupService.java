package ru.gb.oop.seminario4.service;

import ru.gb.oop.seminario4.data.StudyGroup;
import ru.gb.oop.seminario4.data.Teacher;
import ru.gb.oop.seminario4.data.User;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<User> students){
        this.studyGroup = new StudyGroup(teacher, students);
    }
    public void createStudent(User user){
        studyGroup.createStudent(user);
    }
    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
    public List<User> getStudentList(){
        return studyGroup.getStudentList();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }
}