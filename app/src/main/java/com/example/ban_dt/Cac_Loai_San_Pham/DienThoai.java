package com.example.ban_dt.Cac_Loai_San_Pham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ban_dt.R;
import com.example.ban_dt.Xu_Ly_Giao_Dien.DrawerBaseActivity;
import com.example.ban_dt.databinding.ActivityDienThoaiBinding;

public class DienThoai extends DrawerBaseActivity {
    ActivityDienThoaiBinding activityDienThoaiBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDienThoaiBinding = ActivityDienThoaiBinding.inflate(getLayoutInflater());
        setContentView(activityDienThoaiBinding.getRoot());
        allocateActivityTitle("Trang Bán Điện Thoại");
    }
}