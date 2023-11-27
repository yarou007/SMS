package com.GL.SMS.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

    @Temporal(TemporalType.DATE)
    private Date DateNaissence;

    @Temporal(TemporalType.DATE)
    private Date LastTimeActivity;
}
