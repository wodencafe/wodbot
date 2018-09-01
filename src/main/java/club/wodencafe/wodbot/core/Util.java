package club.wodencafe.wodbot.core;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import lombok.SneakyThrows;

public class Util {
	@SneakyThrows
	public static final Path getWodHome() {

			Path homeDir = Paths.get(System.getProperty("user.home"));

			Path wodDir = homeDir.resolve(".wodbot");

			if (Files.notExists(wodDir)) {
				Files.createDirectory(wodDir);
			}
			return wodDir;

	}
	
	
}
