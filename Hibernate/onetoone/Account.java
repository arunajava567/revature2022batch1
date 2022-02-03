package com.pms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
//@Cachable
//@Cache(strategy="") //readonly
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "viewAllAccounts", query = "FROM Account a") ,
 * 
 * 
 * })
 */
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
    @Column
	String name;
    @Column
	Double amount;
    
    @OneToMany(cascade=CascadeType.ALL,targetEntity=Product.class)
    @JoinTable(name="accountproduct")
    Set<Product> products;
    
    
    
    
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	public Account(String name, Double amount) {
	//	super();
	//	this.id = id;
		this.name = name;
		this.amount = amount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
   public  Account() {}
    
	
}
