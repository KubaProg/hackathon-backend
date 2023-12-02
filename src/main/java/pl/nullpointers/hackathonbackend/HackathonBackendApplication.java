package pl.nullpointers.hackathonbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.nullpointers.hackathonbackend.Cable.CableDataService;

@SpringBootApplication
public class HackathonBackendApplication {

    @Autowired
    private CableDataService cableDataService;

    public static void main(String[] args) {
        SpringApplication.run(HackathonBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            String filePath = "src/main/resources/static/data.json";
            cableDataService.saveCableDataFromFile(filePath);
        };
    }


}
