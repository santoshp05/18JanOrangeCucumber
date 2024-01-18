package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	public String validatergettitle() {
		return driver.getTitle();
	}
	public String validatergetCurrenturl() {
		return driver.getCurrentUrl();
	}
	
	
}
