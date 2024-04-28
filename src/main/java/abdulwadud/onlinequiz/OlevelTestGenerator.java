//package abdulwadud.onlinequiz;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class OlevelTestGenerator {
//
//    public List<Question> generatePhysicsQuestions(int count) {
//        // Generate and return a list of physics questions
//        List<Question> physicsQuestions = new ArrayList<>();
//        // Add logic to generate physics questions here
//        return physicsQuestions;
//    }
//
//    public List<Question> generateChemistryQuestions(int count) {
//        // Generate and return a list of chemistry questions
//        List<Question> chemistryQuestions = new ArrayList<>();
//        // Add logic to generate chemistry questions here
//        return chemistryQuestions;
//    }
//
//    public List<Question> generateMathsQuestions(int count) {
//        // Generate and return a list of maths questions
//        List<Question> mathsQuestions = new ArrayList<>();
//        // Add logic to generate maths questions here
//        return mathsQuestions;
//    }
//
//    @Service
//    public static class ExamController {
//
//        public List<OLevelTestGenerator.MCQuestion> generatePhysicsQuestions(int count) {
//            List<OLevelTestGenerator.MCQuestion> physicsQuestions = new ArrayList<>();
//
//            // Sample physics questions
//            for (int i = 0; i < count; i++) {
//                String question = "Sample physics question " + (i + 1) + "?";
//                List<String> options = Arrays.asList("Option A", "Option B", "Option C", "Option D");
//                int correctOptionIndex = i % 4; // Just an example, you can adjust the correct option index as needed
//                physicsQuestions.add(new OLevelTestGenerator.MCQuestion(question, options, correctOptionIndex));
//            }
//
//            return physicsQuestions;
//        }
//
//        public List<OLevelTestGenerator.MCQuestion> generateChemistryQuestions(int count) {
//            List<OLevelTestGenerator.MCQuestion> chemistryQuestions = new ArrayList<>();
//
//            // Sample chemistry questions
//            for (int i = 0; i < count; i++) {
//                String question = "Sample chemistry question " + (i + 1) + "?";
//                List<String> options = Arrays.asList("Option A", "Option B", "Option C", "Option D");
//                int correctOptionIndex = i % 4; // Just an example, you can adjust the correct option index as needed
//                chemistryQuestions.add(new OLevelTestGenerator.MCQuestion(question, options, correctOptionIndex));
//            }
//
//            return chemistryQuestions;
//        }
//
//        public List<OLevelTestGenerator.MCQuestion> generateMathsQuestions(int count) {
//            List<OLevelTestGenerator.MCQuestion> mathsQuestions = new ArrayList<>();
//
//            // Sample maths questions
//            for (int i = 0; i < count; i++) {
//                String question = "Sample maths question " + (i + 1) + "?";
//                List<String> options = Arrays.asList("Option A", "Option B", "Option C", "Option D");
//                int correctOptionIndex = i % 4; // Just an example, you can adjust the correct option index as needed
//                mathsQuestions.add(new OLevelTestGenerator.MCQuestion(question, options, correctOptionIndex));
//            }
//
//            return mathsQuestions;
//        }
//    }
//}
