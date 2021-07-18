package com.manuanand.readmore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String url;
	
	private String description;
	
	private Integer ownerReaderId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOwnerReaderId() {
		return ownerReaderId;
	}

	public void setOwnerReaderId(Integer ownerReaderId) {
		this.ownerReaderId = ownerReaderId;
	}

}
