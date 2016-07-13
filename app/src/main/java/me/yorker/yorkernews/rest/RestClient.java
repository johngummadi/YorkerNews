package me.yorker.yorkernews.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by johngummadi on 6/26/16.
 */
public class RestClient {
    private static RestClient s_instance = new RestClient();
    private static final String BASE_URL = "https://api.cognitive.microsoft.com/bing/v5.0/news/";
    private MicrosoftService microsoftService;

    private RestClient() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .registerTypeAdapterFactory(new ItemTypeAdapterFactory())
                .create();


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .setConverter(new GsonConverter(gson))
                .build();

        microsoftService = restAdapter.create(MicrosoftService.class);
    }

    public static RestClient getInstance() {
        return s_instance;
    }
    public MicrosoftService getMicrosoftService() {
        return microsoftService;
    }
}
