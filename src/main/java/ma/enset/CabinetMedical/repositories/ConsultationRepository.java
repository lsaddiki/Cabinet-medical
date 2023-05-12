package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation> findConsultationByPatient(Patient patient);


    List<Consultation> findConsultationByMedecin(Medecin medecin);
}
