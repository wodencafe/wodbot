package club.wodencafe.wodbot.entities;

import java.util.List;

import lombok.Data;

@Data
public class BotConfig {
	private List<String> joinChannels;
	
	private List<String> authorizedUsers;
}
