
package co.tonespy.databinding;

import android.databinding.BaseObservable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class College extends BaseObservable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("yog")
    @Expose
    private Long yog;
    @SerializedName("yoe")
    @Expose
    private Long yoe;
    @SerializedName("grade")
    @Expose
    private String grade;
    @SerializedName("subject")
    @Expose
    private List<String> subject = new ArrayList<String>();
    @SerializedName("location")
    @Expose
    private Location location;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The yog
     */
    public Long getYog() {
        return yog;
    }

    /**
     * 
     * @param yog
     *     The yog
     */
    public void setYog(Long yog) {
        this.yog = yog;
    }

    /**
     * 
     * @return
     *     The yoe
     */
    public Long getYoe() {
        return yoe;
    }

    /**
     * 
     * @param yoe
     *     The yoe
     */
    public void setYoe(Long yoe) {
        this.yoe = yoe;
    }

    /**
     * 
     * @return
     *     The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 
     * @param grade
     *     The grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public List<String> getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

}
