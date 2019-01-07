/**
 * 
 */
package com.ramji.apptad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramji.apptad.dto.StudentConfiguration;
import com.ramji.apptad.dto.StudentDTO;

/**
 * @author kiransuresh
 *
 */
@RestController
public class StudentController {

	/*@Autowired
	private StudentConfiguration configuration;
	*/
	
	@Autowired
	private StudentDTO studentDTO; 
	
	@GetMapping("/getlimits")
	public int getStudentConfiguration() {
		return studentDTO.getMax();
	}
}
