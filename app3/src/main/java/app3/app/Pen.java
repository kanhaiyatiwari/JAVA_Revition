package app3.app;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

//Pen.java
@Entity
@DiscriminatorValue("2")
public class Pen extends MyProduct {
private String color;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

}
