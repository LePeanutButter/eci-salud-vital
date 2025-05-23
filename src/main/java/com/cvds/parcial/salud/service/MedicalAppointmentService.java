package com.cvds.parcial.salud.service;

import com.cvds.parcial.salud.dto.MedicalAppointmentDTO;
import com.cvds.parcial.salud.model.MedicalAppointment;

import java.util.List;

public interface MedicalAppointmentService {
    List<MedicalAppointment> getMedicalAppointments();
    MedicalAppointment getMedicalAppointmentById(String id);
    void createMedicalAppointment(MedicalAppointmentDTO medicalAppointmentDTO);
    void updateMedicalAppointment(String id, MedicalAppointmentDTO medicalAppointmentDTO);
    void deleteMedicalAppointment(String id);
}
