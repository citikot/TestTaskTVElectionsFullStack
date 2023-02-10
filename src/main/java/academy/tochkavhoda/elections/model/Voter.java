package academy.tochkavhoda.elections.model;

import java.util.List;

public class Voter {
    private String name;
    private String address;
    private boolean isActive; // active/inactive
    private boolean isCandidateOffered;
    private boolean isCandidateConfirmed;
    List<Suggestion> suggestions;
    private String login;
    private String password;
    private String token;

    // конструкторы, геттеры и сеттеры
}
