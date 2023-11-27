package com.GL.SMS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String Nom;

    private String Prenom;

    private String Cin;

    private int NumTel;

    private String Email;

    private String AdresseParent;

    private String Password;

    private Date DateNaissence;

    private Date LastTimeActivity;
}
