package com.example.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lego on 10.02.2016.
 */
public class Regex {

    public boolean firmName(String str){
        Pattern pattern = Pattern.compile("^[A-Z]+[A-Za-z]{1,7}+\\s+[A-Z]+[A-Za-z]{1,7}$");
        Matcher matcher = pattern.matcher(str);
        matcher.matches();

        return true;
    }

    public boolean timeApi(){
        StringBuilder buff = new StringBuilder();

        try {
            URL url = new URL("http://www.timeapi.org/+2/now");
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(15000);
                connection.setReadTimeout(15000);
                if (connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    buff.append(in.readLine());
                }else{
                    System.out.println("connection is fail");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("(\\d{4}).(0\\d|1[012]).([0-2]\\d|3[01]).(\\d[0-23]):(\\d{2}):(\\d[0-59])\\+(\\d{2}:\\d{2})");
        Matcher matcher = pattern.matcher(buff.toString());
        matcher.matches();

        return true;
    }
}
