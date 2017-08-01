package com.incrys.controller;

import java.sql.Date;
import javax.validation.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * Created by User on 7/28/2017.
 */


public class BandDTO {

    private int band_id;
    private String band_name;
    private Date formation_date;

    public BandDTO() {
    }

    public BandDTO(int band_id, String band_name, Date formation_date) {
        this.band_id = band_id;
        this.band_name = band_name;
        this.formation_date = formation_date;
    }

    public int getBand_id() {
        return band_id;
    }

    public void setBand_id(int band_id) {
        this.band_id = band_id;
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
}
