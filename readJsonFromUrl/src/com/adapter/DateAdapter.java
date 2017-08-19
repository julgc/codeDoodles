package com.adapter;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateAdapter implements JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
		return new Date(json.getAsJsonPrimitive().getAsLong());
	}

}
