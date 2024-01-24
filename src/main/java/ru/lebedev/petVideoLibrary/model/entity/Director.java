package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import ru.lebedev.petVideoLibrary.model.entity.embedded.HumanPersonalData;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private HumanPersonalData humanPersonalData;
}
