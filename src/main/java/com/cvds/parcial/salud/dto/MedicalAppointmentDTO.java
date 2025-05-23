package com.cvds.parcial.salud.dto;

import com.cvds.parcial.salud.model.Doctor;
import com.cvds.parcial.salud.model.User;
import com.cvds.parcial.salud.model.enums.AppointmentStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MedicalAppointmentDTO {
    private LocalDate date;
    private User user;
    private Doctor doctor;
    private AppointmentStatus appointmentStatus;
}
