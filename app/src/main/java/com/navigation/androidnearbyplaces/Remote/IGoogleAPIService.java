package com.navigation.androidnearbyplaces.Remote;

import com.navigation.androidnearbyplaces.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Acer on 2018-07-06.
 */

public interface IGoogleAPIService {

    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);
}
