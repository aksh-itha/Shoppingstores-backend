package com.shoppingstore.main;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "Store")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
@Entity
public class Store {
	@JsonProperty
	private String storename;

	@Id
	private String address;
	@JsonProperty
	private String type;
	private int fromtimings;
    private int totimings;
	public int getTotimings() {
		return totimings;
	}

	public void setTotimings(int totimings) {
		this.totimings = totimings;
	}

	public int getFromtimings() {
		return fromtimings;
	}

	public void setFromtimings(int fromtimings) {
		this.fromtimings = fromtimings;
	}

	public Store() {

	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
