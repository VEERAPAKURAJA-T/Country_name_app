package com.example.countaryname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.countaryname.Model.CountaryModel;
import com.example.countaryname.service.GetCountaryDataService;
import com.example.countaryname.service.RetrofitInstance;

import java.util.ArrayList;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
ArrayList<CountaryModel> countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetCountries();
    }

    public Object GetCountries() {
        GetCountaryDataService  getCountaryDataService= RetrofitInstance.getService();
        Call<Result> call =getCountaryDataService.getResult();
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result =  response.body();
                if(result!=null&& result.getResult()!=null){
                     countries = (ArrayList<CountaryModel>) result.getResult();
                     for(CountaryModel c: countries){
                         Log.i("TAG",""+c.getName());
                     }
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
        return countries;
    }
}