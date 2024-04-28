package abdulwadud.onlinequiz.dao;

import abdulwadud.onlinequiz.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {


    List<Question> findByExamType(String examType);
}
