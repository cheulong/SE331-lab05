package camt.cbsd.controller;

import camt.cbsd.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {
    @GetMapping
    public ResponseEntity<?> getStudents(){
        Student student=new Student(1,"SE001","Prayuth","The minister"
                ,3.59,"images/tu.jpg",false,15,"The great man ever!!!");
        return ResponseEntity.ok(student);
    }
}
