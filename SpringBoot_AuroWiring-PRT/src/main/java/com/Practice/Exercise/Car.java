package com.Practice.Exercise;

import org.springframework.stereotype.Component;


@Component
public class Car {
	private String name;
	private String Color;
	private int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", Color=" + Color + ", year=" + year + "]";
	}
	public void yahoo() {
		System.out.println("heyyyy");
	}
	
}
