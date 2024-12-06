package ru.romiro.spring.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String username;

    @Column(name="birthday")
    private String birthday;

    @Column(name = "email")
    private String email;

    public User() {}

}