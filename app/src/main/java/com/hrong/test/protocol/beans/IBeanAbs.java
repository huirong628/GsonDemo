package com.hrong.test.protocol.beans;

import com.google.gson.Gson;

public abstract class IBeanAbs {

	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
