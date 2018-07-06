package com.navigation.androidnearbyplaces;

import com.navigation.androidnearbyplaces.Remote.IGoogleAPIService;
import com.navigation.androidnearbyplaces.Remote.Retrofitclient;

/**
 * Created by Acer on 2018-07-06.
 */

public class Common {

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService(){
        return Retrofitclient.getCilent(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}

