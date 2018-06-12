package com.springjpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account100")
public class Account implements Serializable {

    @Id
    @Column(name = "account_id")
    @SequenceGenerator(name = "account_number_id_seq", sequenceName = "account_number_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_number_id_seq")
    private int accountid;

    @Basic
    private int accountNumber;

    @Basic
    private String owner;

    @Basic
    private double balance;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountid() {return accountid;}
    public void setAccountid(int idAccount) {this.accountid = idAccount;}


}

