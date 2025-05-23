package com.cvds.parcial.salud.dto;

import com.cvds.parcial.salud.model.Specialty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDTO {
    private Specialty specialty;

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
