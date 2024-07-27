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
	@AttributeOverride(name="id",column = @Column(name="dev_id")),
	@AttributeOverride(name="name",column = @Column(name="dev_name")),
	@AttributeOverride(name="salary",column = @Column(name="dev_salary"))
})
public class Developer extends Employee{
	
	@Column
	String tech;
	
	@Column
	String project;
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	
}
