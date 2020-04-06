package com.volkangurbuz.service.FutureXUserApp.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.volkangurbuz.service.FutureXUserApp.UserId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigInteger;

@Entity
@IdClass(UserId.class)
@JsonIgnoreProperties({"hibernateLzyInitializer" , "handler"})
public class User {

    @Id
    private BigInteger userid;
    @Id
    private BigInteger courseid;
    private String firstname;

    public User() {
    }


    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String username) {
        this.firstname = username;
    }
}
