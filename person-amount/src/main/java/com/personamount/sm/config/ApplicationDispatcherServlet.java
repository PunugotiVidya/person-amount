package com.personamount.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class Configurations[] = {AppConfig.class};
		return Configurations;
	}

	@Override
	protected String[] getServletMappings() {
		String mappings[] = {"/"};
		return mappings;
	}

}
