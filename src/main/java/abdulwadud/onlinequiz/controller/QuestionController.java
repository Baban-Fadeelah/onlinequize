package abdulwadud.onlinequiz.controller;

import abdulwadud.onlinequiz.Question;
import abdulwadud.onlinequiz.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question") // URL paths are typically lowercase
public class QuestionController {

    private final QuestionService questionService;

    // Constructor injection is preferred
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/all-questions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

//    @GetMapping("/all-questions") // URL paths typically use hyphens
//    public List<Question> getAllQuestions() {
//        return questionService.getAllQuestions();
//    }

    @GetMapping("/exam-type/{examType}") // URL paths typically use hyphens
    public List<Question> getQuestionByExamType(@PathVariable String examType) {
        return questionService.getQuestionByExamType(examType);
    }
}

