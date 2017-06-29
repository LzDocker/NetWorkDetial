package com.dcoker.networkdetial.api;

import com.dcoker.networkdetial.entry.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mr.Zhang on 2017/6/27.
 */

public interface userInfoService {

// http://flad.feiliu.com/Cashfiyapp/servlet/IndexServelet


    @GET("api/login")
    Call<User>getUserinfo(@Query("uid") int uid, @Query("lang")int lang);


}
