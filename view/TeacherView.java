package ru.gb.oop.seminario4.view;

import ru.gb.oop.seminario4.data.Student;
import ru.gb.oop.seminario4.data.Teacher;

import java.util.List;

public class TeacherView implements UserViewInterface<Teacher>{


    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Spisok teacher");
        for (Teacher teacher: listT) {
            System.out.println(teacher.getTeacherId() + teacher.getFirstName() + teacher.getSecondName());
        }
    }
}
