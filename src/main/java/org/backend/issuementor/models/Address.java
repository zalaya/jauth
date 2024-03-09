package org.backend.issuementor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "addresses", schema = "issuementor")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "country", length = 100)
    private String country;

}