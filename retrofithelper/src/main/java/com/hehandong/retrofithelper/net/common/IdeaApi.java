package com.hehandong.retrofithelper.net.common;

import retrofit2.Retrofit;

/**
 * Created by zhpan on 2017/4/1.
 */

public class IdeaApi {
    public static <T> T getApiService(Class<T> cls, String baseUrl) {
//        Retrofit retrofit = RetrofitUtils.getRetrofitBuilder(baseUrl).build();
        Retrofit retrofit = RetrofitUtils.getRetrofit(baseUrl);
        return retrofit.create(cls);
    }
}
