package com.anish.camel;

import org.springframework.stereotype.Component;

@Component
public class EntityClass {
	private Long id;
	private String from;
	private String to;
	private float conversionMultiple;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public float getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(float conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple=" + conversionMultiple
				+ ", getId()=" + getId() + ", getFrom()=" + getFrom() + ", getTo()=" + getTo()
				+ ", getConversionMultiple()=" + getConversionMultiple() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public EntityClass(Long id, String from, String to, float conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public EntityClass() {
		
	}
	
	

}
