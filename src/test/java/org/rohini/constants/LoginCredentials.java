
package org.rohini.constants;


public enum LoginCredentials {
	
	USER_ID("krirohini"),
	PASSWORD("selflearning2020"),
	USER_NAME("Rohini Kumari");
	
	private String credentials;
	
	public String getCredentials() {
		//System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		return this.credentials;
	}

	private LoginCredentials(String creString) {
		this.credentials = creString;
	}
	
	

}
