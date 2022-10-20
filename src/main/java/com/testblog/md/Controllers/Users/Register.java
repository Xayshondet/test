package com.testblog.md.Controllers.Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String lname;
    private String fname;
    private String emal;
    private String status;


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", emal='" + emal + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
