package campingceria.master.entity;

public class Config {
	
	private Long pkConfig;
	private String configName;
	private String configValue;
	
	public Long getPkConfig() {
		return pkConfig;
	}
	public void setPkConfig(Long pkConfig) {
		this.pkConfig = pkConfig;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getConfigValue() {
		return configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}
