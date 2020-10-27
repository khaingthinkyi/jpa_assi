package com.mmit.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class Orderdetail implements Serializable {
	@Id
	private int id;
	private int subQty;
	private int subPrice;
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private Orders order;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	private static final long serialVersionUID = 1L;

	public int getSubQty() {
		return subQty;
	}

	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}

	public int getSubPrice() {
		return subPrice;
	}

	public void setSubPrice(int subPrice) {
		this.subPrice = subPrice;
	}

	public Orderdetail() {
		super();
	}

}
