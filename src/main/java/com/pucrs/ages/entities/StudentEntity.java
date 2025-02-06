package com.pucrs.ages.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    @Id
    Long id;

    Date birthday;
    String name;
    String email;
    String cpf;

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", CPF: " + cpf;
    }
}
