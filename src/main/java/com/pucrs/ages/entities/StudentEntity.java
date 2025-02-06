package com.pucrs.ages.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue
    Long id;

    Date birthday;
    String name;
    String email;
    String cpf;
}
