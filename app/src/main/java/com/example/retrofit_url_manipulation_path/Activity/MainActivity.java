package com.example.retrofit_url_manipulation_path.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofit_url_manipulation_path.Adapter.UserAdapter;
import com.example.retrofit_url_manipulation_path.Interface.ApiInterface;
import com.example.retrofit_url_manipulation_path.Model.Model;
import com.example.retrofit_url_manipulation_path.R;
import com.example.retrofit_url_manipulation_path.Retrofit.ApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private ApiInterface apiInterface;
    private List<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getComments();


    }

    private void getComments() {
        apiInterface = ApiClient.getInstance().getApi();

        // Use PATH
        Call<List<Model>> call = apiInterface.getComments(3);
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                models = response.body();
                userAdapter = new UserAdapter(models);
                recyclerView.setAdapter(userAdapter);

            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void init() {
        recyclerView = findViewById(R.id.userRecyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        models = new ArrayList<>();

    }
}
