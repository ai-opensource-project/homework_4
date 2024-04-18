package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private static final int[] IMAGE_RES_IDS = {
            R.drawable.dog,
            R.drawable.cat,
            R.drawable.rabbit,
            R.drawable.parrots
    };

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ImageFragment.newInstance(IMAGE_RES_IDS[position]);
    }

    @Override
    public int getItemCount() {
        // 이미지 배열의 크기 반환
        return IMAGE_RES_IDS.length;
    }
}
