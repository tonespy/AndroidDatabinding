package co.tonespy.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oladeji on 19/08/2016.
 */
public class PersonObject extends BaseObservable {

    private static final String TAG = "PersonObject";
    public final ObservableField<String> phoneNumber = new ObservableField<>();

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("age")
    @Expose
    private Long age;
    @SerializedName("college")
    @Expose
    private College college;
    @SerializedName("phonenumber")
    @Expose
    private Long phonenumber;
    @SerializedName("hobby")
    @Expose
    private List<Hobby> hobby = new ArrayList<Hobby>();

    public ObservableField<String> getPhoneNumber() {
        Log.e(TAG, "Phone: " + phoneNumber.get());
        if (phoneNumber.get() != null && !phoneNumber.get().equals("null")) phonenumber = Long.valueOf(phoneNumber.get());
        else phonenumber = null;
        return phoneNumber;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The firstname
     */
    @Bindable
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @param firstname
     *     The firstname
     */
    public void setFirstname(String firstname) {
        Log.e(TAG, "FirstName: " + firstname);
        this.firstname = firstname;
    }

    /**
     *
     * @return
     *     The lastname
     */
    @Bindable
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname
     *     The lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     *
     * @return
     *     The email
     */
    @Bindable
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        Log.e(TAG, "Email: " + email);
        this.email = email;
    }

    @BindingAdapter({"bind:emailText"})
    public static void checkEmail(final EditText editText, String text) {
        editText.addTextChangedListener(new SimpleTextWatcher() {
            @Override
            public void onTextChanged(String newValue) {
                if (newValue.length() > 0) {
                    if (!emailMatchPattern(newValue))
                        editText.setError("Invalid Email");
                }
            }
        });
    }

    /**
     *
     * @return
     *     The age
     */
    public Long getAge() {
        return age;
    }

    /**
     *
     * @param age
     *     The age
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     *
     * @return
     *     The college
     */
    public College getCollege() {
        return college;
    }

    /**
     *
     * @param college
     *     The college
     */
    public void setCollege(College college) {
        this.college = college;
    }

    /**
     *
     * @return
     *     The phonenumber
     */
    public Long getPhonenumber() {
        return phonenumber;
    }

    /**
     *
     * @param phonenumber
     *     The phonenumber
     */
    public void setPhonenumber(Long phonenumber) {
        phoneNumber.set(String.valueOf(phonenumber));
        this.phonenumber = phonenumber;
    }

    /**
     *
     * @return
     *     The hobby
     */
    public List<Hobby> getHobby() {
        return hobby;
    }

    /**
     *
     * @param hobby
     *     The hobby
     */
    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    public static boolean emailMatchPattern(String s) {
        if (s != null && s.length() > 0) {
            Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
            Matcher m = p.matcher(s);
            return m.matches();
        }
        return false;
    }
}