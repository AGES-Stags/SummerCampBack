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
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    StudentService studentService;

    //CREATE
    @RequestMapping(path = "/create", method = POST)
    public ResponseEntity createStudent(@RequestBody StudentEntity newStudent) throws ParseException {
        StudentEntity studentEntity = studentService.createStudent(newStudent);
        return ResponseEntity.ok(studentEntity.getId());
    }

    //    READ
    @GetMapping("{id}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long id) {
        StudentEntity student = studentService.get(id);
        return ResponseEntity.ok(student);
    }

}
