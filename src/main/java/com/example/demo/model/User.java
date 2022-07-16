package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table( name = "user")
	public class User implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1641784680320050823L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "name", nullable = false, length = 255)
	    private String name;
	    
	    @Column(name = "balance")
	    private double Balance;
	    
	    
	    

		public User() {
			super();
		}




		public User(String name, double balance) {
			super();
			this.name = name;
			Balance = balance;
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


		public double getBalance() {
			return Balance;
		}


		public void setBalance(double balance) {
			Balance = balance;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    
		
		
	    
}
