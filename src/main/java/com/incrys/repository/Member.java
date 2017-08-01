package com.incrys.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by User on 7/27/2017.
 */

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private int member_id;

    @Column(name = "member_name")
    @NotNull
    private String member_name;

    @Column(name = "date_of_birth")
    @NotNull
    private Date date_of_birth;

    @Column(name = "position", columnDefinition = "ENUM('guitar','vocal','drums','bass','keyboard')")
    @NotNull
    @Enumerated(EnumType.STRING)
    private com.incrys.repository.position position;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "band_id")
    private Band band_id;

    public Member() {
    }

    public Member(int id) {
        this.member_id = id;
    }

    public Member(String name, Date dateOfBirth, com.incrys.repository.position position, Band band) {
        this.member_name = name;
        this.date_of_birth = dateOfBirth;
        this.position = position;
        this.band_id = band;
    }

    public int getId() {
        return member_id;
    }

    public void setId(int id) {
        this.member_id = id;
    }

    public String getName() {
        return member_name;
    }

    public void setName(String name) {
        this.member_name = name;
    }

    public Date getDateOfBirth() {
        return date_of_birth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.date_of_birth = dateOfBirth;
    }

    public position getPosition() {
        return position;
    }

    public void setPosition(position position) {
        this.position = position;
    }

    @JsonIgnore
    public Band getBand() {
        return band_id;
    }

    public void setBand(Band band_id) {
        this.band_id = band_id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", position=" + position +
                ", band_id=" + band_id +
                '}';
    }
}
