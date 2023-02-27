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

    private Voter(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.isActive = builder.isActive;
        this.isCandidateOffered = builder.isCandidateOffered;
        this.isCandidateConfirmed = builder.isCandidateConfirmed;
        this.login = builder.login;
        this.password = builder.password;
        this.token = builder.token;
        this.suggestions = builder.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String address;
        private boolean isActive; // active/inactive
        private boolean isCandidateOffered;
        private boolean isCandidateConfirmed;
        List<Suggestion> suggestions;
        private String login;
        private String password;
        private String token;

        private Builder() {
        }

        public Builder addName(String name) {
            this.name = name;
            return this;
        }

        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder addIsActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder addIsCandidateOffered(boolean isCandidateOffered) {
            this.isCandidateOffered = isCandidateOffered;
            return this;
        }

        public Builder addIsCandidateConfirmed(boolean isCandidateConfirmed) {
            this.isCandidateConfirmed = isCandidateConfirmed;
            return this;
        }

        public Builder addSuggestions(List<Suggestion> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        public Builder addLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder addPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder addToken(String token) {
            this.token = token;
            return this;
        }

        public Voter build() {
            return new Voter(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isCandidateOffered() {
        return isCandidateOffered;
    }

    public void setCandidateOffered(boolean candidateOffered) {
        isCandidateOffered = candidateOffered;
    }

    public boolean isCandidateConfirmed() {
        return isCandidateConfirmed;
    }

    public void setCandidateConfirmed(boolean candidateConfirmed) {
        isCandidateConfirmed = candidateConfirmed;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voter voter)) return false;

        if (isActive() != voter.isActive()) return false;
        if (isCandidateOffered() != voter.isCandidateOffered()) return false;
        if (isCandidateConfirmed() != voter.isCandidateConfirmed()) return false;
        if (!getName().equals(voter.getName())) return false;
        if (!getAddress().equals(voter.getAddress())) return false;
        if (getSuggestions() != null ? !getSuggestions().equals(voter.getSuggestions()) : voter.getSuggestions() != null)
            return false;
        if (!getLogin().equals(voter.getLogin())) return false;
        if (!getPassword().equals(voter.getPassword())) return false;
        return getToken().equals(voter.getToken());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + (isActive() ? 1 : 0);
        result = 31 * result + (isCandidateOffered() ? 1 : 0);
        result = 31 * result + (isCandidateConfirmed() ? 1 : 0);
        result = 31 * result + (getSuggestions() != null ? getSuggestions().hashCode() : 0);
        result = 31 * result + getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getToken().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                ", isCandidateOffered=" + isCandidateOffered +
                ", isCandidateConfirmed=" + isCandidateConfirmed +
                ", suggestions=" + suggestions +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
