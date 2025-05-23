package com.cvds.parcial.salud.service;

import com.cvds.parcial.salud.dto.DoctorDTO;
import com.cvds.parcial.salud.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctors();
    Doctor getDoctor(String id);
    void createDoctor(DoctorDTO doctorDTO);
    void updateDoctor(String id, DoctorDTO doctorDTO);
    void deleteDoctor(String id);
}
