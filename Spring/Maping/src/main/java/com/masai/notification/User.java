package com.masai.notification;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity

public class User {

	@Id
	@Column(name = "UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name = "UNAME")
	private String  uname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "userNotification", joinColumns = { @JoinColumn(name = "UID") }, inverseJoinColumns = { @JoinColumn(name = "NID") })
	private Set<Notitfication> notification;
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", notifications=" + notification + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Set<Notitfication> getNotification() {
		return notification;
	}
	public void setNotification(Set<Notitfication> notifications) {
		this.notification = notifications;
	}
	@Override
	public int hashCode() {
		return Objects.hash(notification, uid, uname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(notification, other.notification) && uid == other.uid
				&& Objects.equals(uname, other.uname);
	}
	
	

}
