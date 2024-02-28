package com.example.countaryname.service;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountaryDataService {
    /*
    This is that interface that we are going to work with, and it will represent the retrofit interface.
    So what does this interface do?
    This interface will act as a bridge between the modal classes and the retrofit instance with the service and the API.
    So the interface defines the possible HTP operations, every method of an interface or present one possible API call.
    It must have matched the tip, annotation, get or post or, etcetera, to specify the request type
    and the relative your URL.

     */
    /*
    We are going to fetch the data from the api.printful.com slash countries.
OK, so we are going to get I'm going to use that annotation get.We are going to get the data from the internet.
     */
    //Retrofit Interface
    @GET("countries")//here the country is a end point of the website.Because we get the data from the internet.
    Call<Result> getResult();
}
