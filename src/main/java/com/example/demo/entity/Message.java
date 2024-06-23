package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String fromm;
	
	
	private String too;
	
	private String timee;
	
	private String message;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFromm() {
		return fromm;
	}

	public void setFromm(String fromm) {
		this.fromm = fromm;
	}

	public String getToo() {
		return too;
	}

	public void setToo(String too) {
		this.too = too;
	}

	public String getTimee() {
		return timee;
	}

	public void setTimee(String timee) {
		this.timee = timee;
	}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message( String fromm, String too, String timee, String message) {
		super();
		
		this.fromm = fromm;
		this.too = too;
		this.timee = timee;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", fromm=" + fromm + ", too=" + too + ", timee=" + timee + ", message=" + message
				+ "]";
	}

	
	
	

	
	

}
