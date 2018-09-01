package club.wodencafe.wodbot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name="USER")
@PrimaryKeyJoinColumn(name="USER_ID", referencedColumnName="BUSINESS_ENTITY_ID")
@EqualsAndHashCode(callSuper=true)
public class User extends WodEntity {

	private String name;
}
