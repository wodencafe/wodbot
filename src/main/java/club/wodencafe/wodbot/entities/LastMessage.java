package club.wodencafe.wodbot.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class LastMessage {

	private Channel channel;
	
	private User user;
	
	private String message;
}
