package camt.cbsd.service;

import camt.cbsd.entity.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@Service
public class StudentService1 implements StudentService{
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student student = new Student(1, "SE-005", "Mitsuha", "Miyamizu",
                2.15, "images/mitsuha.gif", true, 0, "The most beloved one");
        students.add(student);
        student = new Student(2, "SE-006", "Prayuth", "The minister",
                3.59, "images/tu.jpg", false, 15, "The great man ever!!");
        students.add(student);
        student = new Student(3, "SE-007", "Jurgen", "Kloop",
                2.15, "../../images/Kloop.gif", true, 2, "The man for Kop");
        students.add(student);
        return students;
    }
}
