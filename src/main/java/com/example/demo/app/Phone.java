package com.example.demo.app;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "phones")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID uuid; // Each phone will be given an auto-generated unique identifier when stored

    @Column(name = "phone_name", nullable = false)
    private String phoneName; // Save the name of the phone

    @Column(name = "os", nullable = false)
    private String os; // Save the operating system running in the phone

    // Standard getters and setters
}
