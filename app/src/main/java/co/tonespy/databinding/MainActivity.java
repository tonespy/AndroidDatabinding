package co.tonespy.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import co.tonespy.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    private PersonObject personObject;
    private College college;
    private Hobby hobby;
    private Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Attaching layout to Generated Databinding Util.
         * Same as running setContentView(). But, cooler
         * */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        /**
         * All I did here is call my R.id.createToolbar from
         * ActivityMainBinding declaration. The name is created with the id already
         * */
        setSupportActionBar(binding.createToolbar);

        /**
         * Initialize all Observable POJO object
         * */
        personObject = new PersonObject();
        college = new College();
        hobby = new Hobby();
        location = new Location();

        /**
         * Attach POJO Objects to ActivityMainBinding
         * */
        binding.setPerson(personObject);
        binding.setCollege(college);
        binding.setHobby(hobby);
        binding.setLocation(location);

        /**
         * Same thing I did with Toolbar. Just like that
         * */
        binding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.getPerson().getPhonenumber() != null)
                    Log.e(TAG, "PhoneNumber: " + binding.getPerson().getPhonenumber());
            }
        });
    }
}
