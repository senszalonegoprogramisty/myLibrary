package com.example.bookLibrary.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LendInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lender_id")
    private Long lenderId;
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "date_from")
    private Date dateFrom;
    @Column(name = "date_to")
    private Date dateTo;
    
    public LendInfoEntity(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setLenderId(Long id) {
        this.id = id;
    }

    public Long getLenderId() {
        return id;
    }

    public void setBookId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return id;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateTo() {
        return dateTo;
    }
}
