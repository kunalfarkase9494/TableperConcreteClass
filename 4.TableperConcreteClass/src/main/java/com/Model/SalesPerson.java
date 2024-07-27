package com.Model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@AttributeOverrides({
	@AttributeOverride(name="id",column = @Column(name="sp_id")),
	@AttributeOverride(name="name",column = @Column(name="sp_name")),
	@AttributeOverride(name="salary",column = @Column(name="sp_salary"))
})
public class SalesPerson extends Employee{
	@Column
	String client;
	@Column
	String target;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
	
}
