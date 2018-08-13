package mvp.com.viewmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.view.View;
import android.widget.Toast;

import mvp.com.R;
import mvp.com.model.bean.User;
import mvp.com.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user = new User("yuyong","123");
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   //     setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        binding.setUser(user);
        binding.setController(new Controller());
    }

    public class Controller {
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            user.setUserName(s.toString());
            binding.setUser(user);
        }

        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "clickMe", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(User user) {
            Toast.makeText(MainActivity.this, user.getUserName(), Toast.LENGTH_SHORT).show();
        }
    }
}
