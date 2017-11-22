package polimi.firstapp.rest;

import polimi.firstapp.app.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mirco on 26/10/17.
 */

public interface MovieRestInterface {

    @GET("/?") //http method and the end point (in our case in /?
    public Call<Movie> getMovie(@Query("i") String id, @Query("apiKey") String apiKey);
}
