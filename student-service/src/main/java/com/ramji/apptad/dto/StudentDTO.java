/**
 * 
 */
package com.ramji.apptad.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kiransuresh
 *
 */

@Component
@ConfigurationProperties("limit-service")
public class StudentDTO {
	
	private int min;
	
	private int max;

	public final int getMin() {
		return min;
	}

	public final void setMin(int min) {
		this.min = min;
	}

	public final int getMax() {
		return max;
	}

	public final void setMax(int max) {
		this.max = max;
	}
	
	

}
