package UseCases.Core;

import java.util.HashMap;

/**
 * Data structure storing a user's responses to the questionnaire
 */
public class UserQuestionnaireData {
    private final String username;
    private HashMap<String, Object> data;

    public UserQuestionnaireData(String username) {
        this.username = username;
    }

    /**
     * @return the username of the associated user
     */
    public String getUsername() {
        return username;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    /**
     * @param key the key of the entry
     * @param value the new value of the entry
     * @return whether the key is new
     */
    public boolean updateData(String key, Object value) {
        boolean keyIsNew = data.containsKey(key);
        data.put(key, value);
        return keyIsNew;
    }
}
