package com.staylward.neuralnetworks.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;

@Entity
@Table(name = "weight")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Weight extends BaseEntity {

    @NotBlank
    private Double value;
    @NotBlank
    private ZonedDateTime timeStamp;
}



