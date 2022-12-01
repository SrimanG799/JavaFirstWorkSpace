package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class GsonRead {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson=new Gson();
		JsonElement st=gson.fromJson(new FileReader("Gson.json"), JsonElement.class);
		System.out.println(st);
	
		
		
		
	}

}
