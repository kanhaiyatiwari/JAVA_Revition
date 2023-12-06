package app2.app;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int age;
//@Embedded
//private Adress adress;
@ElementCollection (fetch = FetchType.EAGER)
@Embedded
@JoinTable(name="studentAdress",joinColumns=@JoinColumn(name="st_id"))
private List<Adress> adress;


public int getId() {
	
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



public Student() {
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", adress=" + adress + "]";
}
public Student(int id, String name, int age, List<Adress> adress) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.adress = adress;
}
public List<Adress> getAdress() {
	return adress;
}
public void setAdress(List<Adress> adress) {
	this.adress = adress;
}


}
 