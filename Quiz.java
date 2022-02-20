package DimaHelp;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO Каким-то образом улучшить читаемость кода
public class Quiz {

    Map<String, String> questions = new HashMap<>();

    {
        questions.put("Имя", "");
        questions.put("сколько лет", "");

    }


    public Map<String, String> getQuestions() {
        return questions;
    }

    // TODO Узнать является ли такой параметр (questions) в методах приемлемым (в том смысле что один и тот же параметр на все методы)
    public void askQuestions(Map<String, String> questions)
    {
        for (String question : questions.keySet()) {
            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            questions.put(question, answer);
        }
    }
    public void printResult(Map<String, String> questions) {
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            String result = entry.getKey() + " " + entry.getValue();
            System.out.println(result);
        }
    }

    public void startQuiz(Map<String, String> questions) {
        if (questions.isEmpty()) {
            System.out.println("We don't have any questions");
            return;
        }
        askQuestions(questions);
        printResult(questions);
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.startQuiz(quiz.getQuestions());
    }


}
