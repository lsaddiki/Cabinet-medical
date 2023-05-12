package ma.enset.CabinetMedical;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.repositories.ConsultationRepository;
import ma.enset.CabinetMedical.repositories.MedecinRepository;
import ma.enset.CabinetMedical.repositories.PatientRepository;
import ma.enset.CabinetMedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner {
	@Autowired
	private final PatientRepository patientRepository;
	@Autowired
	private final MedecinRepository medecinRepository;
	@Autowired
	private final ConsultationRepository consultationRepository;
	private ICabinetService cabinetService;

	public CabinetMedicalApplication(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, ICabinetService cabinetService) {
		this.patientRepository = patientRepository;
		this.medecinRepository = medecinRepository;
		this.consultationRepository = consultationRepository;
		this.cabinetService = cabinetService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Patient p1=new Patient(null, "Roudani", "hamid", "T445633", "0667335419", "roudani76@gmail.com", new Date(), null);
		patientRepository.save(p1);
		Patient p2=new Patient(null, "Ramy", "samir", "G124698", "0678445267", "ramy67@gmail.com", new Date(), null);
		patientRepository.save(p2);*/

		/*List<Patient> patients = patientRepository.findAll();
		for (Patient p:patients) {
			System.out.println(p.getNom()+" "+p.getPrenom()+" "+p.getEmail());
		}*/

		/*Patient p=patientRepository.findById(1l).get();
		p.setPrenom("HANANE");
		patientRepository.save(p);*/

		/*patientRepository.deleteById(2l);*/

		/*Patient p1=new Patient();
		p1.setNom("allaki");
		p1.setPrenom("ala");
		p1.setCin("TA66678");
		p1.setTel("0674403428");
		p1.setEmail("allaki34@gmail.com");
		p1.setDateNaissance(new Date());
		cabinetService.addPatient(p1);

		Medecin m1=new Medecin();
		m1.setNom("maraki");
		m1.setPrenom("Nabila");
		m1.setEmail("nmaraki@gmail.com");
		m1.setTel("0646402254");
		cabinetService.addMedecin(m1);*/

		Medecin m1= cabinetService.getMedecinById(4l);
		Patient p1= cabinetService.getPatientById(1l);
		Consultation c1=new Consultation();
		c1.setDateConsultation(new Date());
		c1.setDescription("description de consultation");
		c1.setPatient(p1);
		c1.setMedecin(m1);
		cabinetService.addConsultation(c1);

		Consultation c2 = cabinetService.getConsultationById(5l);
		System.out.println(c2.getDescription() + " " + c2.getMedecin().getNom() + " " + c2.getPatient().getNom());

	}
}