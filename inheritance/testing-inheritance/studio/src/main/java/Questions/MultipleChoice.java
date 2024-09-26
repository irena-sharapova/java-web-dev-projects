package Questions;

import java.awt.Choice;

public class MultipleChoice extends Questions {
    public MultipleChoice(String questions, Choice[] choiceArray) {
        super(questions, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOSE ONE:" + newline +
                getQuestions() + newline +
                getFormattedChoices();
    }

}
