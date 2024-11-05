package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("user_name")
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "type", nullable = false)
    private String type;


    @JsonProperty("displayname_en")
    @Column(name = "displayname_en", nullable = false, length = 100)
    private String displayname_en;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "faculty")
    private String faculty;
}
