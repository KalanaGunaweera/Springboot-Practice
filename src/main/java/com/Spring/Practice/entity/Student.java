package com.Spring.Practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Student")
public class Student {
    @Id
    private Long id;
    @Column(name = "S-Name")
    private String name;
    @Column(name = "S-course")
    private String course;
    @Column(name = "S-fee")
    private  double fee;
}
