package com.example;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WeatherApp
 */
public class WeatherApp {

	String city;

	private static final String API_KEY = "81881daedd516739e63834a991b87b7d";
	private String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="
			+ API_KEY;

	public static void main(String[] args) {

	}

}
