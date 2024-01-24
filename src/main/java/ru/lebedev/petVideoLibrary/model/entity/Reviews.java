package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import ru.lebedev.petVideoLibrary.model.enums.Grade;

@Entity
@NoArgsConstructor
@Getter
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Film film;
    private User user;
    private String description;
    @Enumerated(EnumType.STRING)
    private Grade grade;
}
