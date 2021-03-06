package eu.dariah.de.colreg.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import de.dariah.aai.javasp.web.helper.AuthInfoHelper;

public class BaseController {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public final String NAVIGATION_ELEMENT_ATTRIBUTE = "_navigationAttribute";
	
	@Autowired protected AuthInfoHelper authInfoHelper;
	
	@Value(value="${url.login:null}")
	private String loginUrl;
	
	@Value(value="${url.logout:null}")
	private String logoutUrl;
	
	
	public String getLoginUrl() {
		return loginUrl;
	}

	public String getLogoutUrl() {
		return logoutUrl;
	}
}
