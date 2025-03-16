package site.nomoreparties.stellarburgers.response;

import com.google.gson.annotations.SerializedName;


public class IdIngredient {
    @SerializedName("_id")
    private String id;

    public String getId() {
        return id;
    }


}
