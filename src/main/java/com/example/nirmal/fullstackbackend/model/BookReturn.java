package com.example.nirmal.fullstackbackend.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BookReturn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String book_name;
    private String author_name; // Corrected field name
    private Long book_code;
    // private Date dateOfBorrow = new Date(); // Default value set to current date/time
    // private Date dateOfReturn=new Date();
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.DATE)
    private Date date2;

    private String student_name;
    private Long reg_no;
    private String department;
    private Long mobile_no;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() { // Corrected getter name
        return author_name;
    }

    public void setAuthor_name(String author_name) { // Corrected setter name
        this.author_name = author_name;
    }

    public Long getBook_code() {
        return book_code;
    }

    public void setBook_code(Long bookcode) {
        this.book_code = bookcode;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Long getReg_no() {
        return reg_no;
    }

    public void setReg_no(Long reg_no) {
        this.reg_no = reg_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(Long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}
