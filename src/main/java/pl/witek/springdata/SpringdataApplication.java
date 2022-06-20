package pl.witek.springdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.witek.springdata.domain.User;
import pl.witek.springdata.repository.ItemRepository;
import pl.witek.springdata.repository.UserRepository;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SpringdataApplication.class);


    public static void main(String... args) throws Exception {
        SpringApplication.run(SpringdataApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {

    }
}
