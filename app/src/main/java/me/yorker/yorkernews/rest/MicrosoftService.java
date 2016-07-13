package me.yorker.yorkernews.rest;

import me.yorker.yorkernews.rest.model.NewsEnvelope;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;


/**
 * Created by johngummadi on 6/26/16.
 */
public interface MicrosoftService {
    @Headers({
            "Ocp-Apim-Subscription-Key: 743e24daacce4939aeca5c86fe414f20",
            "User-Agent: Yorker News"
    })
    @GET("/")
    void getNews(Callback<NewsEnvelope> callback);
}
