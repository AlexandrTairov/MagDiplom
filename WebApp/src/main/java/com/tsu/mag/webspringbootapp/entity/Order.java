package com.tsu.mag.webspringbootapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

//    @OneToOne(mappedBy = "id")
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
}
