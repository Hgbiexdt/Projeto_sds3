package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO  implements Serializable {
	private static final long serialVersionUID  = 1L;
	
	private String sellerNme;
	private Double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerNme = seller.getName();
		this.sum = sum;
	}

	public String getSellerNme() {
		return sellerNme;
	}

	public void setSellerNme(String sellerNme) {
		this.sellerNme = sellerNme;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
