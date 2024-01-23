package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import ru.lebedev.petVideoLibrary.model.enums.Grade;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Reviews {
    @Id
    private Long id;
    private Film film;
    private User user;
    private String description;
    private Grade grade;
}
