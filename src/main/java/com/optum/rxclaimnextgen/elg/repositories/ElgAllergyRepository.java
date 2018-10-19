package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgAllergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElgAllergyRepository extends JpaRepository<ElgAllergy, String> {
    ElgAllergy findByallergyCode(String allergyCode);
}
