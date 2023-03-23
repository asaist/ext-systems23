package edu.javacourse.register.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ro_birth_certificate")
@Entity

public class BirthCertificate
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "birth_certificate_id")
    private Long birthCertificateId;
    @Column(name = "number_certificate")
    private String number;
    @Column(name = "date_issue")
    private LocalDate issueDate;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "father_id")
    private PersonMale father;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "mother_id")
    private PersonFemale mother;

}
