package ru.lebedev.petVideoLibrary.model.entity.embedded;

import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public class HumanPersonalData {
    private String name;
    private String surname;
    private Date dateOfBirth;
}
