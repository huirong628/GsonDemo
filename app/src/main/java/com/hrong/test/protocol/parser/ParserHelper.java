package com.hrong.test.protocol.parser;


import com.hrong.test.protocol.beans.IBeanAbs;

public class ParserHelper<T extends IBeanAbs> {

	/** 协议类型-JSON */
	public static final int PROTOCOL_JSON = 1;

	/**
	 * 协议类型
	 */
	protected int protocol = PROTOCOL_JSON;

	protected Class<T> beanClass;

	/**
	 * 构造
	 * @param beanClass 类型
	 */
	public ParserHelper(Class<T> beanClass) {
		this.beanClass = beanClass;
	}

	/**
	 * 构造
	 * @param beanClass 类型
	 * @param protocol 协议类型
	 */
	public ParserHelper(Class<T> beanClass, int protocol) {
		this.beanClass = beanClass;
		this.protocol = protocol;
	}

	/**
	 * 获取协议类型
	 * @return 协议类型
	 */
	public int getProtocol() {
		return protocol;
	}

	/**
	 * 设置协议类型
	 * @param protocol 协议类型
	 */
	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}

	/**
	 * 使用设置的协议类型解析
	 * @param data 数据
	 * @throws Exception
	 * @return  bean 对象
	 */
	public T getBean(String data) throws Exception {
		IParserAbs<T> parser = null;

		switch (protocol) {
			case PROTOCOL_JSON:
				parser = new JsonParser<T>();
				break;

			default:
				break;
		}

		return parser.parse(data, beanClass);
	};

}
