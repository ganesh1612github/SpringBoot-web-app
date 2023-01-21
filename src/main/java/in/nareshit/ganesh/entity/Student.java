package in.nareshit.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="stutab")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="sid")
	private Integer stuId;
	
	@Column(name="sname")
	private String stuName;
	
	@Column(name="scourse")
	private String stuCourse;
	
	@Column(name="sfee")
	private double stuFee;
	

}
