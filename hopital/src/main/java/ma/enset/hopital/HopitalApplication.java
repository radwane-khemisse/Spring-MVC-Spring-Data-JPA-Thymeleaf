package ma.enset.hopital;

import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// En utilisant le constructeur par defaut
		Patient patient = new Patient();
		patient.setId(null);
		patient.setName("redone");
		patient.setDateOfBirth(new Date());
		patient.setSick(true);
		patient.setScore(10);

		// En utilisant le constructeur
		Patient patient2 = new Patient(null, "Hassan", new Date(), true, 100);

		// En utilisons builder
		Patient patient3 = Patient.builder()
				.name("karima")
				.dateOfBirth(new Date())
				.score(53)
				.isSick(true)
				.build();


	}
}
