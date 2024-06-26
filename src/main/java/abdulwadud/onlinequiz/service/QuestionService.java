package abdulwadud.onlinequiz.service;

import abdulwadud.onlinequiz.Question;
import abdulwadud.onlinequiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

     public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByExamType(String examType) {
        return questionDao.findByExamType(examType);
    }

}
