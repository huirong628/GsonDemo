package com.hrong.test.protocol.parser;


import com.hrong.test.protocol.beans.IBeanAbs;

public abstract class IParserAbs<T extends IBeanAbs> {

	/**
	 * 获取协议类型
	 * @return 协议类型
	 */
	public abstract int getProtocol();

	/**
	 * 解析对象
	 * @param data
	 * @param beanClass
	 * @throws Exception
	 * @return Bean
	 */
	public abstract T parse(String data, Class<T> beanClass) throws Exception;

}
