package academy.tochkavhoda.elections.model;

import java.util.Map;

public class Suggestion {

    private String login; // voter login
    private String text;
    private Map<String, Integer> gradeMap; // login and grade offered for suggestion

    public Double getAverageGrade(){
        Double result = 0.0;
        return result;
    }


}
