package org.eop.common.http.param;

import org.eop.common.http.HttpParam;
import org.eop.common.http.RequestBodyType;
import org.eop.common.http.ResponseBodyType;

/**
 * @author lixinjie
 * @since 2018-07-19
 */
public class JsonParam extends HttpParam {

	public JsonParam() {
		super();
		setRequestBodyType(RequestBodyType.JSON);
		setResponseBodyType(ResponseBodyType.JSON);
	}
	
	public void setJsonBody(String json) {
		setBody(json);
	}
}
