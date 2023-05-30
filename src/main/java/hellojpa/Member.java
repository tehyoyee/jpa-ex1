package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

	@javax.persistence.Id
	private Long Id;
	private String name;

	public Member() {
	}

	public Member(Long id, String name) {
		this.Id = id;
		this.name = name;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}
}
