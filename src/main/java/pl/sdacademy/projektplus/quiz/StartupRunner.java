package pl.sdacademy.projektplus.quiz;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sdacademy.projektplus.quiz.database.entities.PlayerEntity;
import pl.sdacademy.projektplus.quiz.database.entities.PlayerRepository;
import pl.sdacademy.projektplus.quiz.services.QuizDataService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private QuizDataService quizDataService;

    @Override
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
        // ...
        quizDataService.getQuizCategories();
        //quizDataService.getQuizQuestions();
    }
}
