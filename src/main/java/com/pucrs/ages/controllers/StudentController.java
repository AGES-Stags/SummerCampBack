package com.pucrs.ages.controllers;

import com.pucrs.ages.entities.StudentEntity;
import com.pucrs.ages.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@AllArgsConstructor
public class StudentController {

    StudentService studentService;

    //CREATE
    @RequestMapping(path = "/create", method = GET)
    public String createStudent() throws ParseException {
        studentService.createStudent(
            new StudentEntity(
                0L,
                new SimpleDateFormat("dd-MM-yyyy").parse("14-05-1996"),
                "Cley",
                "cleyson.oliveira@logiclabsoftwares.com",
                "645.790.620-60"
            )
        );
        return "HELLO WORLD DO SUMMER CAMP";
    }

    //    READ
    @GetMapping("{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id) {
        StudentEntity student = studentService.get(id);
        return ResponseEntity.ok(student);
    }

}
