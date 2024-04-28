
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    @GetMapping("/physics")
    public List<OLevelTestGenerator.MCQuestion> getPhysicsQuestions() {
        return OLevelTestGenerator.generatePhysicsQuestions();
    }

    @GetMapping("/chemistry")
    public List<OLevelTestGenerator.MCQuestion> getChemistryQuestions() {
        return OLevelTestGenerator.generateChemistryQuestions();
    }

    @GetMapping("/maths")
    public List<OLevelTestGenerator.MCQuestion> getMathsQuestions() {
        return OLevelTestGenerator.generateMathsQuestions();
    }
}
