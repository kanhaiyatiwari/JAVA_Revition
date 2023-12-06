package com.masai.notification;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Notitfication {
@Id
@Column(name = "NID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int nid;
@Column(name = "NName")
private String nname;
@ManyToMany(mappedBy = "notification",cascade=CascadeType.ALL)
private Set<User> user;
@Override
public String toString() {
	return "Notitfication [nid=" + nid + ", nname=" + nname + ", user=" + user + "]";
}
public int getNid() {
	return nid;
}
public void setNid(int nid) {
	this.nid = nid;
}
public String getNname() {
	return nname;
}
public void setNname(String nname) {
	this.nname = nname;
}
public Set<User> getUser() {
	return user;
}
public void setUser(Set<User> user) {
	this.user = user;
}
@Override
public int hashCode() {
	return Objects.hash(nid, nname, user);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Notitfication other = (Notitfication) obj;
	return nid == other.nid && Objects.equals(nname, other.nname) && Objects.equals(user, other.user);
}

//getters and setters


}
