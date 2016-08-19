
package co.tonespy.databinding;

import android.databinding.BaseObservable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location extends BaseObservable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("position")
    @Expose
    private List<Double> position = new ArrayList<Double>();

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The position
     */
    public List<Double> getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(List<Double> position) {
        this.position = position;
    }

}
