package polimi.firstapp.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mirco on 09/11/17.
 */

public class Rating {

    @SerializedName("Source")
    @Expose
    private String score;

    @SerializedName("Value")
    @Expose
    private String value;

}
