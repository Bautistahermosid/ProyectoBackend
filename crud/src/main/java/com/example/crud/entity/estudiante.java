package com.example.crud.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "tbl_estudiante")

public class estudiante {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long estudianteid;
    private String firstname;
    private String lastname;
    @Column(name="email_adress",unique=true,nullable= false)
    private String email;
}
