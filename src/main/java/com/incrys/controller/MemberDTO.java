package com.incrys.controller;

import com.incrys.repository.Band;

import java.sql.Date;

/**
 * Created by User on 7/28/2017.
 */
public class MemberDTO {

    private int member_id;
    private String member_name;
    private Date date_of_birth;
    private com.incrys.repository.position position;
    private Band band_id;

    public MemberDTO() {
    }

    public MemberDTO(int member_id, String member_name, Date date_of_birth, com.incrys.repository.position position, Band band_id) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.date_of_birth = date_of_birth;
        this.position = position;
        this.band_id = band_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public com.incrys.repository.position getPosition() {
        return position;
    }

    public void setPosition(com.incrys.repository.position position) {
        this.position = position;
    }

    public Band getBand_id() {
        return band_id;
    }

    public void setBand_id(Band band_id) {
        this.band_id = band_id;
    }
}
