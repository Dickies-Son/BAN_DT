package com.example.ban_dt.Cac_Loai_San_Pham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ban_dt.R;
import com.example.ban_dt.Xu_Ly_Giao_Dien.DrawerBaseActivity;
import com.example.ban_dt.databinding.ActivityLaptopBinding;

public class Laptop extends DrawerBaseActivity {
    ActivityLaptopBinding activityLaptopBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLaptopBinding = ActivityLaptopBinding.inflate(getLayoutInflater());
        setContentView(activityLaptopBinding.getRoot());
        allocateActivityTitle("Trang Bán Laptop");
    }
}