package org.eop.common.autoconfigure.idgene;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lixinjie
 * @since 2018-09-06
 */
@ConfigurationProperties(prefix = "id.generator")
public class IdGeneratorProperties {

	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	//base-time
	private String baseTime = "2018-01-01 00:00:00.000";
	//node-num
	private long nodeNum = 0;
	
	public long getBaseTime() {
		try {
			return df.parse(baseTime).getTime();
		} catch (ParseException pe) {
			throw new RuntimeException(pe);
		}
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public long getNodeNum() {
		return nodeNum;
	}
	public void setNodeNum(long nodeNum) {
		this.nodeNum = nodeNum;
	}
}
