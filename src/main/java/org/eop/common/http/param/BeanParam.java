package org.eop.common.http.param;

import org.eop.common.http.RequestBodyType;

/**
 * @author lixinjie
 * @since 2018-05-21
 */
public class BeanParam extends FileParam {

	public BeanParam() {
		super();
		setRequestBodyType(RequestBodyType.BEAN);
	}
	
	public void addBean(String name, Object bean) {
		addField(name, bean);
	}
}
