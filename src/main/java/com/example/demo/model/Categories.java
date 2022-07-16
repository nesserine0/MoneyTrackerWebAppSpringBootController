package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "categories")
public class Categories implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 397446873944341994L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    @Column(name = "name")
    private String name;

    @Column(name = "img_id")
    private int img_id;
    

	public Categories() {
		super();
	}

	public Categories(int id, String name, int img_id) {
		super();
		this.id = id;
		this.name = name;
		this.img_id = img_id;
	}

	public Categories(String name, int img_id) {
		super();
		this.name = name;
		this.img_id = img_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImg_id() {
		return img_id;
	}

	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
	
    
}
