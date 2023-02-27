package academy.tochkavhoda.elections.dto.request;

public class RegisterVoterDTORequest {

    private String name;
    private String login;
    private String password;

    public RegisterVoterDTORequest(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterVoterDTORequest that)) return false;

        if (!getName().equals(that.getName())) return false;
        if (!getLogin().equals(that.getLogin())) return false;
        return getPassword().equals(that.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RegisterVoterDTORequest{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
