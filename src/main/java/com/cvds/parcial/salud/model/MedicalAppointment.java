package com.cvds.parcial.salud.model;

import com.cvds.parcial.salud.model.enums.AppointmentStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Document(collection = "MedicalAppointment")
public class MedicalAppointment {
    @Id
    private String id;
    private LocalDate date;
    private User user;
    private Doctor doctor;
    private AppointmentStatus appointmentStatus;
}
