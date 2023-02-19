package com.kamillooto.springbootexcelexport;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "COURSE_DTLS")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private Integer id;
    private String name;
    private Double price;
}
