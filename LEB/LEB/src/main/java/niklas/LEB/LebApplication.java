package niklas.LEB;

import niklas.LEB.runner.TvShowRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LebApplication {

	private static final TvShowRunner tvShowRunner = new TvShowRunner();

	public static void main(String[] args) {
		SpringApplication.run(LebApplication.class, args);

		int numberOfRuns = Integer.parseInt(args[0]);

		tvShowRunner.runTvShowWithoutChangingBox(numberOfRuns);
		tvShowRunner.runTvShowWithChangingBox(numberOfRuns);

	}

}
