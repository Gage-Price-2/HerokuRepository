package com.gcu.data.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity 
{
	@Id
	Long Id;
	
	@Column("ORDER_NO")
	String OrderNo;
	
	@Column("PRODUCT_NAME")
	String ProductName;
	
	@Column("PRICE")
	float Price;
	
	@Column("QUANTITY")
	int Quantity;
	
	
	public OrderEntity(long Id, String OrderNo, String ProductName, float Price, int Quantity) {
		// TODO Auto-generated constructor stub
		this.Id = Id;
		this.OrderNo = OrderNo;
		this.ProductName = ProductName;
		this.Price = Price;
		this.Quantity = Quantity;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		this.Id = id;
	}


	public String getOrderNo() {
		return OrderNo;
	}


	public void setOrderNo(String orderNo) {
		this.OrderNo = orderNo;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		this.ProductName = productName;
	}


	public float getPrice() {
		return Price;
	}


	public void setPrice(float price) {
		this.Price = price;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}
	
	

}
