package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    //List<Patient> findPatientByNomContainsOrPrenomContainsOrEmailContainsOrCinContains(String Query);

}
