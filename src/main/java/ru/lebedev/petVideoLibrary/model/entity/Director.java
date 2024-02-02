package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.lebedev.petVideoLibrary.model.entity.embedded.HumanPersonalData;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private HumanPersonalData humanPersonalData;
}
