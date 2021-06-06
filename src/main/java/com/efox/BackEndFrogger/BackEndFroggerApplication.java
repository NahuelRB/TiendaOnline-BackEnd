package com.efox.BackEndFrogger;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.URI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndFroggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndFroggerApplication.class, args);                
           }
}