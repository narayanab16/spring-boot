package com.narayana.client;

import com.narayana.server.model.User;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestClient {
    public static void main(String[] args) {
        RestTemplate client = new RestTemplate();
        String url = "http://localhost:10000/springboot/addUser";
        HttpMethod httpMethod = HttpMethod.POST;
        String body = """
                {
                "id": 200,
                "username": "Narayana "
                }
                """.strip();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity httpEntity = new HttpEntity<>(body, headers);
        // call rest api
        ResponseEntity<User> resData = client.exchange(url, httpMethod, httpEntity, User.class);
        if(resData.getStatusCode().value() == 200) {
            System.out.println(" Add user success ");
            User user = resData.getBody();
            System.out.println("The "  + user + ", added to the server");
        }
    }
}
