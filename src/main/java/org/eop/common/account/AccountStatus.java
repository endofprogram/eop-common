package org.eop.common.account;

/**
 * @author lixinjie
 * @since 2018-10-21
 */
public enum AccountStatus {

	Normal(0, "正常"),
	Disabled(1, "禁用"),
	Expired(2, "过期"),
	Locked(3, "锁定");
	
	private Integer statusCode;
	private String statusName;
	
	private AccountStatus(Integer statusCode, String statusName) {
		this.statusCode = statusCode;
		this.statusName = statusName;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public String getStatusName() {
		return statusName;
	}
	
	public static AccountStatus valueOf(Integer statusCode) {
		for (AccountStatus accountStatus : values()) {
			if (accountStatus.statusCode == statusCode) {
				return accountStatus;
			}
		}
		throw new IllegalArgumentException("account status code '" + statusCode + "' is invalid.");
	}
}
