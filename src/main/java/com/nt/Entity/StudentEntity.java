package com.nt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class StudentEntity {
	@Id
	@GeneratedValue
	private Integer sid;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String timings;

}
