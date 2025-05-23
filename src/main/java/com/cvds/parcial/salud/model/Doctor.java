package com.cvds.parcial.salud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Doctor")
public class Doctor {
    @Id
    private String id;
    private Specialty specialty;

    public void setId(String id) {
        this.id = id;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
