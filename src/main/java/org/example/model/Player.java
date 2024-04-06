package org.example.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private int age;
    //private Date birthOfDate;
    @Column(nullable = false)
    private int heatPoints;
    @Column(nullable = false)
    private float attack;
    @Column(nullable = false)
    private int luck;
    @Column(nullable = false)
    private float attackSpeed;
    @Column(nullable = false)
    private float speed;
}
