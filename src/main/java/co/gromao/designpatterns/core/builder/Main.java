package co.gromao.designpatterns.core.builder;

import co.gromao.designpatterns.core.builder.HttpClient.Builder;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HttpClient.Builder httpClientBuilder = new Builder();
        HttpClient httpClient =
                httpClientBuilder
                        .withMethod("GET")
                        .withUrl("https://url.com/here")
                        .withBody("{}")
                        .withHeaders(Map.of("Header1", "Value1"))
                        .secure("user", "pass")
                        .build();

        System.out.println(httpClient);
    }

}
