package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import ru.lebedev.petVideoLibrary.model.enums.Genre;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Set<Actor> actors;
    private Director director;
    private Date releaseDate;
    private String country;
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;
}


