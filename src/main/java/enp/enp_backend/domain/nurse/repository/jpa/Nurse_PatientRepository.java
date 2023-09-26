package enp.enp_backend.domain.nurse.repository.jpa;

import enp.enp_backend.entity.Patient;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Profile("db")
@Repository
public interface Nurse_PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findAll();
    Patient findPatientByHn(String hn);
    List<Patient> findByNameIgnoreCaseContainingOrSurnameIgnoreCaseContainingOrHnIgnoreCaseContaining(String name,String surname, String hn);
}
