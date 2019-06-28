package com.niit.miet.shopping_backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier implements Serializable 

{

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)




	private int supplierId;
	
	private String supplierName;
	
	private String supplierAdd;

	
	public int getSupplierId() 
	{
		return supplierId;
	}

	
	public void setSupplierId(int supplierId) 
	{
		this.supplierId = supplierId;
	}

	
	public String getSupplierName()
																			{
		return supplierName;
	}

	
	
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}

	
	
	public String getSupplierAdd()
	{
		return supplierAdd;
	}

	
	public void setSupplierAdd(String supplierAdd)
	{
		this.supplierAdd = supplierAdd;
	}
	
	
	
	

}
