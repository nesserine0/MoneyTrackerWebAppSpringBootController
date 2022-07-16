package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "img")
public class Images implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2208595251933934010L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "path", nullable = false, length = 255)
    private String path;
    
    /////////////////////////////////////////////////////////////
    
    //constructors

	public Images() {
		super();
	}
	

	public Images(String path) {
		super();
		this.path = path;
	}

	public Images(int id, String path) {
		super();
		this.id = id;
		this.path = path;
	}

	
	
	///////////////////////////////////////////////////////////////
	
	//setters and getters 
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    
    
	

}
