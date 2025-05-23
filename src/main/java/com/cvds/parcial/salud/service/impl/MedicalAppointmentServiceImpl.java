package com.cvds.parcial.salud.service.impl;

import com.cvds.parcial.salud.dto.MedicalAppointmentDTO;
import com.cvds.parcial.salud.model.MedicalAppointment;
import com.cvds.parcial.salud.model.enums.AppointmentStatus;
import com.cvds.parcial.salud.repository.MedicalAppointmentRepository;
import com.cvds.parcial.salud.service.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentServiceImpl implements MedicalAppointmentService {
    @Autowired
    MedicalAppointmentRepository medicalAppointmentRepository;

    @Override
    public List<MedicalAppointment> getMedicalAppointments() {
        return medicalAppointmentRepository.findAll();
    }

    @Override
    public MedicalAppointment getMedicalAppointmentById(String id) {
        return medicalAppointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medical appointment not found with id: " + id));
    }

    @Override
    public void createMedicalAppointment(MedicalAppointmentDTO medicalAppointmentDTO) {
        MedicalAppointment medicalAppointment = new MedicalAppointment();
        medicalAppointment.setDate(medicalAppointmentDTO.getDate());
        medicalAppointment.setUser(medicalAppointmentDTO.getUser());
        medicalAppointment.setDoctor(medicalAppointmentDTO.getDoctor());
        medicalAppointment.setAppointmentStatus(medicalAppointmentDTO.getAppointmentStatus());
        medicalAppointmentRepository.save(medicalAppointment);
    }

    @Override
    public void updateMedicalAppointment(String id, MedicalAppointmentDTO medicalAppointmentDTO) {
        MedicalAppointment medicalAppointment = medicalAppointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medical appointment not found with id: " + id));

        if (medicalAppointmentDTO.getDate() != null) {
            medicalAppointment.setDate(medicalAppointmentDTO.getDate());
        }
        if (medicalAppointmentDTO.getUser() != null) {
            medicalAppointment.setUser(medicalAppointmentDTO.getUser());
        }
        if (medicalAppointmentDTO.getDoctor() != null) {
            medicalAppointment.setDoctor(medicalAppointmentDTO.getDoctor());
        }
        if (medicalAppointmentDTO.getAppointmentStatus() != null) {
            medicalAppointment.setAppointmentStatus(medicalAppointmentDTO.getAppointmentStatus());
        }
        medicalAppointmentRepository.save(medicalAppointment);
    }

    @Override
    public void deleteMedicalAppointment(String id) {
        MedicalAppointment medicalAppointment = medicalAppointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medical appointment not found with id: " + id));
        medicalAppointment.setAppointmentStatus(AppointmentStatus.CANCELED);
        medicalAppointmentRepository.save(medicalAppointment);
    }
}
