package ma.enset.CabinetMedical.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @Column(length = 100)
    private String email;
    private String tel;

    @OneToMany(mappedBy = "medecin")
    private Collection<Consultation> Consultation;
}
