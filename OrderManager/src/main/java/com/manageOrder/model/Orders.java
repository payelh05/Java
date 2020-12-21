package com.manageOrder.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders implements Serializable {
	@Id
	@Column
	private int id;
	
	@Column
	private String item;
	
	@Column
	private int price;
	
	@Column
	private String state;
	
	@Column
	private int pin;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		if (pin <= 0) {
			throw new IllegalStateException("pin is not valid");
		}
		
		//pin should be of 16 digits in India
		int length = (int)(Math.log10(pin)+1);
		if ( length != 7) {
			throw new IllegalStateException("pin is not valid");
		}		
		
		
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		if (price < 0) {
			throw new IllegalStateException("price is wrong");
		}
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", price=" + price + ", state=" + state + ", pin=" + pin + "]";
	}

}
