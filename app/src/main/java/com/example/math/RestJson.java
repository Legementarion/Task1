package com.example.math;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Lego on 11.02.2016.
 */
public class RestJson {

    public void weather(){
        StringBuilder buff = new StringBuilder();
        JSONParser parser =  new JSONParser();;
        JSONObject object = new JSONObject();

        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Dnipropetrovsk,ua&lang=en&units=metric&appid=44db6a862fba0b067b1930da0d769e98");
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(15000);
                connection.setReadTimeout(15000);
//                connection.setRequestProperty("Dnipropetrovsk", "metric");
                if (connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    buff.append(in.readLine());
                }else{
                    System.out.println("connection is fail");
                }
                object = (JSONObject) parser.parse(buff.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(buff);
        System.out.println("---------------");
        System.out.println(object.get("name"));



    }
}
