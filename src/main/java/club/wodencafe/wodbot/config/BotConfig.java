package club.wodencafe.wodbot.config;

import java.util.List;

import lombok.Data;

@Data
public class BotConfig {
	private List<String> joinChannels;
	
	private List<String> authorizedUsers;
}
