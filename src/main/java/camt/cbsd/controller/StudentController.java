package camt.cbsd.controller;

import camt.cbsd.entity.Student;
import camt.cbsd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/student")
public class StudentController {
    StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService=studentService;
    }
    @GetMapping
    public ResponseEntity<?> getStudents(){
//        Student student=new Student(1,"SE001","Prayuth","The minister"
//                ,3.59,"images/tu.jpg",false,15,"The great man ever!!!");

        //for 2.1
//        List<Student> students=new ArrayList<>();
//        Student student=new Student(1,"SE-001","Mitsuha","Miyamizu",
//                2.15,"images/mitsuha.gif",true,0,"The most beloved one");
//        students.add(student);
//         student=new Student(2,"SE-002","Prayuth","The minister",
//                3.59,"images/tu.jpg",false,15,"The great man ever!!");
//        students.add(student);
//        student=new Student(3,"SE-003","Jurgen","Kloop",
//                2.15,"images/Kloop.gif",true,2,"The man for Kop");
//        students.add(student);
        List<Student> students=studentService.getStudents();
        return ResponseEntity.ok(students);
    }
}
