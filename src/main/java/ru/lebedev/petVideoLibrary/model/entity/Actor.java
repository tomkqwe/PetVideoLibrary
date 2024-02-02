package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.lebedev.petVideoLibrary.model.entity.embedded.HumanPersonalData;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private HumanPersonalData humanPersonalData;
}
