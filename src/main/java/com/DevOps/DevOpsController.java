package com.DevOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {		
		@GetMapping(value = "/getdevops")
		public String get() {
			return "hello devops";
		}

}
