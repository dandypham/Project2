package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PASSENGER")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="passSequence")
	@SequenceGenerator(name="passSequence", sequenceName="PASS_SEQ", allocationSize=1)
	@Column(name="P_ID")
	private int id;
	
	@Column(name="P_NAME")
	private String name;
	
	@Column(name="P_HOMEWORLD")
	private String homeworld;
	
	@Column(name="P_STARSHIP")
	private boolean starship;
	
	public Passenger() {
		super();
	}

	public Passenger(int id, String name, String homeworld, boolean starship) {
		super();
		this.id = id;
		this.name = name;
		this.homeworld = homeworld;
		this.starship = starship;
	}

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

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public boolean isStarship() {
		return starship;
	}

	public void setStarship(boolean starship) {
		this.starship = starship;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", homeworld=" + homeworld + ", starship=" + starship + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((homeworld == null) ? 0 : homeworld.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (starship ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (homeworld == null) {
			if (other.homeworld != null)
				return false;
		} else if (!homeworld.equals(other.homeworld))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (starship != other.starship)
			return false;
		return true;
	}
	
}
