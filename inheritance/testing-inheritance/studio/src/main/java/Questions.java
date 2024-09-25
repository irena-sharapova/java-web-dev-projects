import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Questions {

    public abstract class Question {
        private final String question;
        private final HashMap<Integer, Choice> choiseMap = new HashMap<>;
        private int maxResponces = 1;

        public Question(String question, Choice[] choiceArray) {
            this.question = question;
        }

        public String getQuestion() {
            return question;
        }

        public HashMap<Integer, Choice> getChoiseMap() {
            return choiseMap;
        }

        public int getMaxResponces() {
            return maxResponces;
        }

        public void setMaxResponces(int maxResponces) {
            this.maxResponces = maxResponces;
        }

        @Override
        public abstract String toString();

        void createRandomizedChoiceMap(Choice[] choiceArray){
            ArrayList<Choice> choiceList = new ArrayList<>();
            Collections.addAll(choiceList, chiceArray);
            Collections.shuffle(choiceList);
            for (int i=0; i< choiceList.size(); i++){
                choiceMap.put(i+1, choiceList.get(i));
            }
        }

        String getFormatedChoises() {
            StringBuilder formattedChoices = new StringBuilder();
            String newLine = System.lineSeparator();
            for (int choiceNum : choiceMap.keySet()) {
                String choice = "\t " + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newLine;
                formattedChoices.append(choice);
            }
            return formattedChoices.toString();
        }

        public boolean isInvalid(String resp) {
            try {
                int respInt = Integer.parseInt(resp);
                return respInt <0 || respInt > choiseMap.size();
            } catch (NumberFormatException 0) {
                return true;
            }
        }
    }
}
