package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Director {
    @Id
    private Long id;
    private String name;
    private String surname;
    private Date dateOfBirth;
}
