package org.rohini.constants;

public enum URLs {
	
	crmHomePageUrl ("https://selflearning.capsulecrm.com/login");
	
	private String url;

	private URLs(String url) {
		this.url = url;
	}
	
	public String getURL() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		return this.url;
	}


}
