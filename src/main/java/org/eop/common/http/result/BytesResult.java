package org.eop.common.http.result;

import org.eop.common.http.HttpResult;

/**
 * @author lixinjie
 * @since 2018-07-19
 */
public class BytesResult extends HttpResult {

	public byte[] getBytesBody() {
		return getBytesBody(getBody());
	}
}
