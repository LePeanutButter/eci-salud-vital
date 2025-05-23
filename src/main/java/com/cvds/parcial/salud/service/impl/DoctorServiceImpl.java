package com.cvds.parcial.salud.service.impl;

import com.cvds.parcial.salud.dto.DoctorDTO;
import com.cvds.parcial.salud.model.Doctor;
import com.cvds.parcial.salud.repository.DoctorRepository;
import com.cvds.parcial.salud.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctor(String id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
    }

    @Override
    public void createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setSpecialty(doctorDTO.getSpecialty());
        doctorRepository.save(doctor);
    }

    @Override
    public void updateDoctor(String id, DoctorDTO doctorDTO) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        if (doctorDTO.getSpecialty() != null) {
            doctor.setSpecialty(doctorDTO.getSpecialty());
        }
        doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(String id) {
        doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        doctorRepository.deleteById(id);
    }
}
