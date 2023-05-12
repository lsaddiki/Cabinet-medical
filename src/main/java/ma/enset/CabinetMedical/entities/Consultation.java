package ma.enset.CabinetMedical.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //Auto incrèment
    @Temporal(TemporalType.DATE)
    @NonNull
    private Date dateConsultation;

    private String description;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;
}
