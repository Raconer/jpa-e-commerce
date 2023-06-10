package com.jpa.commerce.entity.common;

import lombok.Data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
@Data
@MappedSuperclass
public class CommonEntity {

    @Column(updatable = false, nullable = false)
    protected Date regDate;

    @Column(nullable = true, insertable = false)
    protected Date modDate;
}
