package Questions;

public class TrueOrFalse extends Questions  {
        public TrueOrFalse(String questions, Choice[] choiceArray) {
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


