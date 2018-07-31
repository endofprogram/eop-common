package org.eop.common.http.invoker;

import org.eop.common.http.HttpParam;
import org.eop.common.http.HttpResult;

/**
 * @author lixinjie
 * @since 2017-12-19
 */
public interface IHttpInvoker {

	HttpResult invoke(HttpParam httpParam);
}
