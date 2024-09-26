package Questions;

public class Checkbox extends Questions {
    public Checkbox(String questions, Choice[] choiceArray) {
        super(questions, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE OR MORE:" + newline +
                getQuestions() + newline +
                getFormatedChoices();

    }
    public int getNumCorrect() {
        int numCorrect = 0;
        for(Choice choice : getChoiceMap().value()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
