package org.eop.common.sex;

/**
 * @author lixinjie
 * @since 2018-10-23
 */
public enum Sex {

	Female(0, "女"),
	Male(1, "男");
	
	private Integer code;
	private String name;
	
	private Sex(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static final Sex valueOf(Integer code) {
		for (Sex sex : values()) {
			if (sex.code == code) {
				return sex;
			}
		}
		throw new IllegalArgumentException("sex code '" + code + "' is invalid.");
	}
}
