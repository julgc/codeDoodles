package com.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import com.adapter.DateAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vo.UserProfile;

public class ReadHtml {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			StringBuilder jsonString = new StringBuilder();

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				jsonString.append(inputLine);
			}
			in.close();

			Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateAdapter()).create();

			UserProfile[] profiles = gson.fromJson(jsonString.toString(), UserProfile[].class);
			for (UserProfile profile : profiles) {
				System.out.println(profile.getName().getFirst());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
