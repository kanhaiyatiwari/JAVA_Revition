package app3.app;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Book extends MyProduct {
private String author;

public Book(long productId, String name, String author) {
	super(productId, name);
	this.author = author;
}
public Book() {
	
}
public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

}
