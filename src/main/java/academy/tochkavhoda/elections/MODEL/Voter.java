package academy.tochkavhoda.elections.MODEL;

import java.util.List;

class Voter {
    private String name;
    private String address;
    private boolean status; // active/inactive
    private boolean candidateOffered;
    private boolean isCandidateConfirmed;
    List<Suggestion> suggestions;
    private String login;
    private String password;
    // конструкторы, геттеры и сеттеры
}
