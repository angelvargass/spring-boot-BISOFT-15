package vargas.angel.movieDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MovieDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDatabaseApplication.class, args);
	}

}
