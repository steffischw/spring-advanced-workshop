package de.codecentric.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Type type;
}
