package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Product100")
@Entity
public class SampleModal {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	public Integer pno;
	
	@Column(name = "pname" )
	public String pname;
	
	@Column(name = "pquality" )
	public Integer pquality;
	
	@Column(name = "pcost" )
	public Integer pcost;

	
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPquality() {
		return pquality;
	}
	public void setPquality(Integer pquality) {
		this.pquality = pquality;
	}
	public Integer getPcost() {
		return pcost;
	}
	public void setPcost(Integer pcost) {
		this.pcost = pcost;
	}
	
	



}
