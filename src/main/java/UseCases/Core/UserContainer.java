package UseCases.Core;

import Entities.User;

/**
 * Container data structure storing a User and its UserQuestionnaireData
 */
public class UserContainer {
    private final User user;
    private final UserQuestionnaireData userQuestionnaireData;

    public UserContainer(User user, UserQuestionnaireData userQuestionnaireData) {
        this.user = user;
        this.userQuestionnaireData = userQuestionnaireData;
    }

    /**
     * @return the User entity instance
     */
    public User getUser() {
        return user;
    }

    /**
     * @return the user's UserQuestionnaireData instance
     */
    public UserQuestionnaireData getUserQuestionnaireData() {
        return userQuestionnaireData;
    }

    /**
     * @return the username of this user
     */
    public String getUsername() {
        return user.getUsername();
    }
}
