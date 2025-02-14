package com.example.todolistapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.todolistapp.FilesNote.NoteFragment;
import com.example.todolistapp.FilesTasks.TaskFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TaskFragment();
            case 1:
                return new NoteFragment();
            default:
                return new TaskFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
