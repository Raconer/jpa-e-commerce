package com.jpa.commerce.entity.common;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class CommonEntity {

    @Column(updatable = false, nullable = false)
    protected Date regDate;

    @Column(nullable = true, insertable = false)
    protected Date modDate;
}
