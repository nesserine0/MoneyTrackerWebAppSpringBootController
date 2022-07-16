package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "expenses")
public class Expenses implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3464571894847685272L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    @Column(name = "exp")
    private double Exp;

    @Column(name = "categorie")
    private int Categorie;
    
    @Column(name = "type")
    private int Type;
    

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;
	
    @Column(name = "note", nullable = false, length = 255)
    private String note;
    
    public Expenses() {
		super();
	}

	public Expenses(int id, double exp, int categorie, int type, Date date, String note) {
		super();
		this.id = id;
		Exp = exp;
		Categorie = categorie;
		Type = type;
		this.date = date;
		this.note = note;
	}

	public Expenses(double exp, int categorie, int type, Date date, String note) {
		super();
		Exp = exp;
		Categorie = categorie;
		Type = type;
		this.date = date;
		this.note = note;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getExp() {
		return Exp;
	}

	public void setExp(double exp) {
		Exp = exp;
	}

	public int getCategorie() {
		return Categorie;
	}

	public void setCategorie(int categorie) {
		Categorie = categorie;
	}

	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
    
    
	
}
