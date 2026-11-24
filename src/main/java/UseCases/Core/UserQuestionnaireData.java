package UseCases.Core;

/**
 * Data structure storing a user's responses to the questionnaire
 */
public class UserQuestionnaireData {
    private final String username;

    public UserQuestionnaireData(String username) {
        this.username = username;
    }

    /**
     * @return the username of the associated user
     */
    public String getUsername() {
        return username;
    }
}
