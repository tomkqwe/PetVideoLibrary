package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import ru.lebedev.petVideoLibrary.model.entity.embedded.HumanPersonalData;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Actor {
    @Id
    private Long id;
    @Embedded
    private HumanPersonalData humanPersonalData;
}
