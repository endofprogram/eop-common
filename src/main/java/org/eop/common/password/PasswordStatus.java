package org.eop.common.password;

/**
 * @author lixinjie
 * @since 2018-10-21
 */
public enum PasswordStatus {

	Normal(0, "正常"),
	Expired(1, "过期");
	
	private Integer statusCode;
	private String statusName;
	
	private PasswordStatus(Integer statusCode, String statusName) {
		this.statusCode = statusCode;
		this.statusName = statusName;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public String getStatusName() {
		return statusName;
	}
	
	public static PasswordStatus valueOf(Integer statusCode) {
		for (PasswordStatus passwordStatus : values()) {
			if (passwordStatus.statusCode == statusCode) {
				return passwordStatus;
			}
		}
		throw new IllegalArgumentException("password status code '" + statusCode + "' is invalid.");
	}
}
