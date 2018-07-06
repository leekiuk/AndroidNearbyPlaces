package com.navigation.androidnearbyplaces.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Acer on 2018-07-06.
 */

public class Retrofitclient {
    private static Retrofit retrofit = null;
    public static Retrofit getCilent (String baseUrl)
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
