package br.com.concrete.domain.auth;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.validation.constraints.NotEmpty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {
    @NotEmpty(message = "The first name is required")
    @Column(name="first_name")
    public String firstName;

    @NotEmpty(message = "The last name is required")
    @Column(name="last_name")
    public String lastName;

    @NotEmpty(message = "The first email is required")
    @Column(name="email")
    public String email;
}