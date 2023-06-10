package com.jpa.commerce.entity.transit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.jpa.commerce.entity.common.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "TransitStatus")
@EqualsAndHashCode(callSuper=false)
public class TransitStatusEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "transit_id")
    private TransitEntity transit;

    @Column
    private String status;

}
