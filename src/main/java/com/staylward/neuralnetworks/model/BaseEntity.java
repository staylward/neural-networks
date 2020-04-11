package com.staylward.neuralnetworks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.ZonedDateTime;

@MappedSuperclass
@JsonIgnoreProperties(value = {"id", "createdAt", "updatedAt"}, allowGetters = false)
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_at", nullable = false, updatable = false)
    @CreatedDate
    private ZonedDateTime createdAt;

    @Column(name="updated_at", nullable = false, updatable = true)
    @LastModifiedDate
    private ZonedDateTime updatedAt;
}
