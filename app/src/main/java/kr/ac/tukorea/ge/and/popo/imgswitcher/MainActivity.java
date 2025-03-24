package kr.ac.tukorea.ge.and.popo.imgswitcher;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kr.ac.tukorea.ge.and.popo.imgswitcher.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private @NonNull ActivityMainBinding binding;
    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    private static final int[] img_res={
            R.mipmap.cat1, R.mipmap.cat2, R.mipmap.cat3, R.mipmap.cat4, R.mipmap.cat5,
    };
    public void onBtnNext(View view) {
        if(page<5){
            ++page;
        }else{
            page = 1;
        }
        int resId=img_res[page-1];
        binding.mainImageView.setImageResource(resId);
        binding.pageTextView.setText(Integer.toString(page));
    }

    public void onBtnPrev(View view) {
        if(page > 1){
            --page;
        }else{
            page = 5;
        }
        int resId=img_res[page-1];
        binding.mainImageView.setImageResource(resId);
        binding.pageTextView.setText(Integer.toString(page));
    }
}