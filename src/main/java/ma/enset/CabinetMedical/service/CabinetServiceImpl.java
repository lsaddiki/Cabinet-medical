package ma.enset.CabinetMedical.service;

import lombok.AllArgsConstructor;
import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.repositories.ConsultationRepository;
import ma.enset.CabinetMedical.repositories.MedecinRepository;
import ma.enset.CabinetMedical.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CabinetServiceImpl implements ICabinetService {
    PatientRepository patientRepository;
    ConsultationRepository consultationRepository;
    MedecinRepository medecinRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> searchByQuery(String query) {
        return null; //patientRepository.findPatientByNomContainsOrPrenomContainsOrEmailContainsOrCinContains(query);
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return null; //consultationRepository.findConsultationByPatient(patient);
    }

    @Override
    public void addMedecin(Medecin medecin) {
        medecinRepository.save(medecin);

    }

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);

    }

    @Override
    public List<Consultation> getConsultationsByMedecin(Medecin medecin) {
        return null; // return consultationRepository.findConsultationByMedecin(medecin);
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);

    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public void deleteConsultation(Consultation consultation) {
        consultationRepository.delete(consultation);

    }

    @Override
    public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Consultation getConsultationById(Long id) {
        return consultationRepository.findById(id).get();
    }
}
