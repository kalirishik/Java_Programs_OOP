import java.util.*;

class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctOptionIndex;
    private int userSelectedOption;

    public QuizQuestion(String question, List<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.userSelectedOption = -1; // Initialize user's selected option to -1
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public int getUserSelectedOption() {
        return userSelectedOption;
    }

    public void setUserSelectedOption(int userSelectedOption) {
        this.userSelectedOption = userSelectedOption;
    }
}

public class QuizApp {
    private List<QuizQuestion> questions;
    private int score;
    private int currentQuestionIndex;
    private Timer timer;
    private Scanner scanner;
    private int totalQuestions;

    public QuizApp() {
        questions = new ArrayList<>();
        score = 0;
        currentQuestionIndex = 0;
        timer = new Timer();
        scanner = new Scanner(System.in);
        totalQuestions = 0;
    }

    public void addQuestion(QuizQuestion question) {
        questions.add(question);
        totalQuestions++;
    }

    public void startQuiz() {
        if (questions.isEmpty()) {
            System.out.println("No questions available.");
            return;
        }
        score = 0; // Reset score for a new quiz
        currentQuestionIndex = 0; // Reset question index
        startNextQuestion();
    }

    private void startNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            QuizQuestion currentQuestion = questions.get(currentQuestionIndex);
            System.out.println("Question " + (currentQuestionIndex + 1) + " of " + totalQuestions + ": " + currentQuestion.getQuestion());
            for (int i = 0; i < currentQuestion.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + currentQuestion.getOptions().get(i));
            }

            // Start timer for current question (5 seconds)
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    showResult();
                }
            }, 5000); // 5 seconds

            // Read user input for answer
            int selectedOption = -1;
            while (selectedOption < 1 || selectedOption > currentQuestion.getOptions().size()) {
                System.out.print("Enter your answer (1-" + currentQuestion.getOptions().size() + "): ");
                try {
                    selectedOption = scanner.nextInt();
                    if (selectedOption < 1 || selectedOption > currentQuestion.getOptions().size()) {
                        System.out.println("Invalid option. Please enter a number between 1 and " + currentQuestion.getOptions().size() + ".");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Consume invalid input
                }
            }

            currentQuestion.setUserSelectedOption(selectedOption); // Store user's selected option
            submitAnswer(selectedOption);
            currentQuestionIndex++;
        } else {
            showResult();
        }
    }


    public void submitAnswer(int selectedOption) {
        QuizQuestion currentQuestion = questions.get(currentQuestionIndex);
        if (selectedOption == currentQuestion.getCorrectOptionIndex()) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }
        // Cancel timer for current question
        timer.cancel();
        timer = new Timer();
            startNextQuestion();
    }

    private void showResult() {
        System.out.println("Quiz ended!");
        System.out.println("Your Score: " + score + "/" + totalQuestions);
        // Provide summary of correct and incorrect answers
        for (QuizQuestion question : questions) {
            System.out.println("Question: " + question.getQuestion());
            System.out.println("Correct Answer: " + question.getOptions().get(question.getCorrectOptionIndex() - 1));
            if (question.getUserSelectedOption() != -1) {
                System.out.println("Your Answer: " + question.getOptions().get(question.getUserSelectedOption() - 1));
            } else {
                System.out.println("Your Answer: Not attempted");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QuizApp quizApp = new QuizApp();

        // Add some sample questions
        quizApp.addQuestion(new QuizQuestion("What is the capital of France?",
                Arrays.asList("London", "Paris", "Berlin", "Rome"), 2)); // Correct answer is Paris
        quizApp.addQuestion(new QuizQuestion("What is the largest planet in our solar system?",
                Arrays.asList("Mars", "Venus", "Jupiter", "Saturn"), 3)); // Correct answer is Jupiter
        quizApp.addQuestion(new QuizQuestion("What is the powerhouse of the cell?",
                Arrays.asList("Nucleus", "Mitochondria", "Ribosome", "Endoplasmic Reticulum"), 2)); // Correct answer is Mitochondria

        // Start the quiz
        quizApp.startQuiz();
    }
}
