package com.hrong.test.protocol.parser;


import com.google.gson.Gson;
import com.hrong.test.protocol.beans.IBeanAbs;

public class JsonParser<T extends IBeanAbs> extends IParserAbs<T> {

	@Override
	public int getProtocol() {
		return ParserHelper.PROTOCOL_JSON;
	}

	@Override
	public T parse(String data, Class<T> beanClass) throws Exception {
		Gson gson = new Gson();
		return gson.fromJson(data, beanClass);
	}
}
