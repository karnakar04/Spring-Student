package com.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	private int id;
	private String Name;
	private String Email;
	private String Branch;
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Branch=" + Branch + ", contact="
				+ contact + "]";
	}
	public student(int id, String name, String email, String branch, String contact) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Branch = branch;
		this.contact = contact;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
