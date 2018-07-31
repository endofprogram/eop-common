package org.eop.common.http.param;

import org.eop.common.http.HttpParam;
import org.eop.common.http.RequestBodyType;
import org.eop.common.http.ResponseBodyType;

/**
 * @author lixinjie
 * @since 2018-07-19
 */
public class XmlParam extends HttpParam {

	public XmlParam() {
		super();
		setRequestBodyType(RequestBodyType.XML);
		setResponseBodyType(ResponseBodyType.XML);
	}
	
	public void setXmlBody(String xml) {
		setBody(xml);
	}
}
