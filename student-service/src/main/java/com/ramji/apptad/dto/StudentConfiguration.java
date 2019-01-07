/**
 * 
 */
package com.ramji.apptad.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author kiransuresh
 *
 */

@Component
public class StudentConfiguration {
	
	@Value("${limit-service.max}")
	private int maxLimit;
	
	@Value("${limit-service.min}")
	private int minLimit;

	

	
	public StudentConfiguration(int maxLimit, int minLimit) {
		super();
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}




	public final int getMaxLimit() {
		return maxLimit;
	}




	public final int getMinLimit() {
		return minLimit;
	}




	public final void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}




	public final void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}




	public StudentConfiguration() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
