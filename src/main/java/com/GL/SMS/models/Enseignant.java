package com.GL.SMS.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Enseignant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String Nom;

    private String Prenom;

    private int NumTel;

    private String Email;

    private String Password;

    private Date DateNaissence;

    private Date LastTimeActivity;
}
