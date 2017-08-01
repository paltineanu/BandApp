package com.incrys.repository;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 7/27/2017.
 */

@Entity
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "band_id")
    private int id;

    @NotNull
    @Column(name = "band_name")
    @Size(min = 3, max = 100, message = "error.band_name.size")
    private String band_name;

    @NotNull
    @Column(name = "formation_date")
    private Date formation_date;

    @OneToMany(mappedBy = "band_id", cascade = CascadeType.ALL)
    private Set<Member> members = new HashSet<Member>();

    public Band() {
    }

    public Band(int id) {
        this.id = id;
    }

    public Band(String name, Date formation_date) {
        this.band_name = name;
        this.formation_date = formation_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBand_name() {
        return band_name;
    }

    public void setBand_name(String band_name) {
        this.band_name = band_name;
    }

    public Date getFormation_date() {
        return formation_date;
    }

    public void setFormation_date(Date formation_date) {
        this.formation_date = formation_date;
    }

    @Override
    public String toString() {
        return "Band{" +
                "id=" + id +
                ", band_name='" + band_name + '\'' +
                ", formation_date=" + formation_date +
                ", members=" + members +
                '}';
    }
}
