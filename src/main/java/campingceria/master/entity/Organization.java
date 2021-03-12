package campingceria.master.entity;

public class Organization {
	
	private Long pkOrganization;
	private String organizationName;
	private String organizationAddress;
	
	public Long getPkOrganization() {
		return pkOrganization;
	}
	public void setPkOrganization(Long pkOrganization) {
		this.pkOrganization = pkOrganization;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationAddress() {
		return organizationAddress;
	}
	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

}
