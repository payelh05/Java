package com.manageOrder.model;

import java.io.Serializable;

public class Orders implements Serializable
{
	private int id;
	private String item;
	private int price;
	private String state;
	private int pin;
	
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
		this.price = price;
	}
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
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", price=" + price + ", state=" + state + ", pin=" + pin + "]";
	}

}
