package ma.enset.CabinetMedical.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String cin;
    private String tel;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> Consultation;
}
