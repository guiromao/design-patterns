package co.gromao.designpatterns.core.builder;

import java.util.Map;

public class HttpClient {

    private String method;
    private String url;
    private String username;
    private String password;
    private Map<String, String> headers;
    private String body;

    public HttpClient(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.username = builder.username;
        this.password = builder.password;
        this.headers = builder.headers;
        this.body = builder.body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public static class Builder {

        private String method;
        private String url;
        private String username;
        private String password;
        private Map<String, String> headers;
        private String body;

        public Builder() {

        }

        public Builder withMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder secure(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public Builder withHeaders(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }

    }
}
