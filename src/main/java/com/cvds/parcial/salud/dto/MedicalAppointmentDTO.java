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

    public Doctor getDoctor() {
        return doctor;
    }

    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
