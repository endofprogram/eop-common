package org.eop.common.result;

/**
 * @author lixinjie
 * @since 2018-08-08
 */
public enum ResultCode {

	Success(0, "成功"),
	Failure(-1, "失败"),
	ServerError(500, "服务器程序错误");
	
	private int code;
	private String desc;
	
	private ResultCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
