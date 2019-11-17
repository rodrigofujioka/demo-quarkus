package dev.fujioka.quarkus.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonIgnoreProperties(value = {"dtCreation", "dtUpdate"},
        allowGetters = true)
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(length = 150)
    private String name;

    private String description;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date dtCreation;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date dtUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
