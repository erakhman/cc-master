package campingceria.master.entity;

public class Lookup {
	
	private Long pkLookup;
	private String lookupName;
	private String lookupValue;
	
	public Long getPkLookup() {
		return pkLookup;
	}
	public void setPkLookup(Long pkLookup) {
		this.pkLookup = pkLookup;
	}
	public String getLookupName() {
		return lookupName;
	}
	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}
	public String getLookupValue() {
		return lookupValue;
	}
	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

}
