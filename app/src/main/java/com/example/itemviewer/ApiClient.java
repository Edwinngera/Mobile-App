package com.example.itemviewer;

public class ApiClient {
    private static final String BASE_URL = "https://your-api-base-url.com/"; // Replace with your API base URL

    private static Retrofit retrofit;

    public static ApiService getApiService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiService.class);
    }
}

