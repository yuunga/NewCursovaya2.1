package com.example.newcursovaya.ui.broadcast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newcursovaya.DatabaseHelper;
import com.example.newcursovaya.R;
import com.example.newcursovaya.databinding.FragmentBroadcastBinding;
import com.example.newcursovaya.ui.DataObshaga.Student;

import java.util.ArrayList;
import java.util.List;

public class BroadcastFragment extends Fragment {

    private FragmentBroadcastBinding binding;
    private ListView studentListView;
    private ArrayAdapter<Student> adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BroadcastViewModel broadcastViewModel =
                new ViewModelProvider(this).get(BroadcastViewModel.class);

        binding = FragmentBroadcastBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.addStudent(new Student(1, "Иванов Александр Николаевич",
                "ivanov@gmail.com", "238"));
        databaseHelper.addStudent(new Student(1, "Юмашев Евгений Михайлович",
                "youmashev@gmail.com", "237"));
        databaseHelper.addStudent(new Student(1, "Веремеев Павел Евгеньевич",
                "veremeev@gmail.com", "236"));
        databaseHelper.addStudent(new Student(1, "Пивоваров Никита Сергеевич",
                "pivovarov@gmail.com", "235"));
        databaseHelper.addStudent(new Student(1, "Очинский Иванов Викторович",
                "ochinsky@gmail.com", "234"));

        studentListView = root.findViewById(R.id.studentListView);

        // Инициализация и установка адаптера
        List<Student> studentList = getAllStudent();  // Замените на ваш метод получения списка студентов
        adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, studentList);
        studentListView.setAdapter(adapter);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}