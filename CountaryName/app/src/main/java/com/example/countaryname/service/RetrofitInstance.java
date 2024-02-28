package com.example.countaryname.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    /*
    If we create a new retrofit instance, every time we need to communicate with the API, it will waste
the time and waste the memory.
So the best practice here is keeping the retrofit instance as single singleton mean only one instance
during the runtime, or any time that Java or the Android will execute and request an instance from
the retrofit, it should be defined and following the singleton design pattern.
So in the singleton design pattern, we usually define a private static reference variable for this
class
     */
    private  static Retrofit retrofit=null;
    private static String BASE_URL ="https://api.printful.com/";
    //Singleton Pattern used to create an instance of Retrofit
    public static GetCountaryDataService getService(){
        //instance is not created before
        if(retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //if instance is already created
        return retrofit.create(GetCountaryDataService.class);
    }
}
