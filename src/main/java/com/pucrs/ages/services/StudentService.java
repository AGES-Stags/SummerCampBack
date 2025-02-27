package com.pucrs.ages.services;

import com.pucrs.ages.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import com.pucrs.ages.entities.StudentEntity;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

    StudentRepository studentRepository;

    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }


    public StudentEntity get(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
