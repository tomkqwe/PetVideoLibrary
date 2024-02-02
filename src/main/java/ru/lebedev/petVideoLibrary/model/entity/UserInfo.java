package ru.lebedev.petVideoLibrary.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.lebedev.petVideoLibrary.model.entity.embedded.HumanPersonalData;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private HumanPersonalData humanPersonalData;
    private String login;
    private String email;
}
