package club.wodencafe.wodbot.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="BUSINESS_ENTITY")
@Inheritance(strategy=InheritanceType.JOINED)
public class WodEntity {

	@Column(name = "BUSINESS_ENTITY_ID")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date createdDate;
	
	@Column
	private Date modifiedDate;
	
	@PrePersist
	void onCreate() {
		this.setCreatedDate(new Date());
	}
	@PreUpdate
	void onPersist() {
		this.setModifiedDate(new Date());
	}

}
