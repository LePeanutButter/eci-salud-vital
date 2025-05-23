package com.cvds.parcial.salud.repository;

import com.cvds.parcial.salud.model.MedicalAppointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalAppointmentRepository extends MongoRepository<MedicalAppointment, String> {
}
