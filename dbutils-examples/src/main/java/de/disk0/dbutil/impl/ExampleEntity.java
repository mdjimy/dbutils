package de.disk0.dbutil.impl;

import javax.persistence.Column;
import javax.persistence.Table;

import de.disk0.dbutil.api.entities.BaseGuidEntity;

@Table(name="example")
public class ExampleEntity extends BaseGuidEntity {

	// @Column(name="id")
	// private String id <--- already in super class. 
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="parent_id")
	private String parentId;
	
	@Column(name="size")
	private int size;
	
	private String hashOfName; // when mapping, we only look at fields that are explicitely 
							   // declared. a pojo can have any number of additional fields
							   // also, we only look at fields, not at getters or setters.

	public ExampleEntity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHashOfName() {
		return hashOfName;
	}

	public void setHashOfName(String hashOfName) {
		this.hashOfName = hashOfName;
	}
	
	
	
	
	
	
	
	
}
