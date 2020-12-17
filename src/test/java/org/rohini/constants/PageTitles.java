package org.rohini.constants;

public enum PageTitles {
	
	LOGIN_PAGE_TITLE("Self Learning CRM"),
	HOME_PAGE_DASHBOARD_TITLE("Dashboard | Self Learning CRM");
	
	private String pageTitle;
	
	public String getPageTitle() {
		//System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		return this.pageTitle;
	}
	
	private PageTitles(String pageTitle) {
		this.pageTitle = pageTitle;
	}
	


}
