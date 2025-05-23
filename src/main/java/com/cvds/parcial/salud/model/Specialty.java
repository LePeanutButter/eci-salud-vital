package com.cvds.parcial.salud.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Specialty {
    private String name;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
