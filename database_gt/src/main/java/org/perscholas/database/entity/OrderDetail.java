package org.perscholas.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetail {
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}

	public Integer getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
	private Integer id;
	
	@Column(name ="order_id")
	private Integer orderId;
	
	@Column(name ="product_id")
	private Integer productId;
	
	@Column(name ="quantity_ordered")
	private Integer quantityOrdered;
	
	@Column(name ="price_each", columnDefinition="DECIMAL(10,2")
	private Double priceEach;
	
	@Column(name ="order_line_number", columnDefinition="SMALLINT")
	private Integer orderLineNumber;
}
