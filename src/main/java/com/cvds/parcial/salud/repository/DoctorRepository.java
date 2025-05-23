package com.cvds.parcial.salud.repository;

import com.cvds.parcial.salud.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
