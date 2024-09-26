import Questions.Checkbox;
import Questions.MultipleChoice;
import Questions.Questions;
import Questions.TrueOrFalse;
import Questions.Choice;

public class QuizRunner {
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {
        String q1 = "What is the planets?";
        Choice[] q1Choices = new Choice[]{
                new Choice ("Pluto"),
                new Choice ("Uranus"),
                new Choice ("Saturn"),
                new Choice ("Venus"),
                new Choice ("Earth"),

        };


        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "My favorite food";
        Choice[] q2Choices = new Choice[] {
                new Choice ("True"),
                new Choice ("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);


        String q3 = "What is my favorite pets:";
        Choice[] q3Choices = new Choice[]{
                new Choice("Cats", true),
                new Choice("Parrots", true),
                new Choice("Dogs"),
                new Choice("Fish"),
        };

        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);


        quiz.addQuestions(new Questions[]{question1, question2, question3});


        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered" + quiz.getNumCorrect() + "of"+
                quiz.getQuestions().size() +
                "questions correctly. " + newline);
        }
    }

