package com.AutoSuggest.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@Component 
public class autoSuggestRestController {
	
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();


	    @RequestMapping("/AutoSuggestService")
	    public Suggest suggest(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Suggest(counter.incrementAndGet(),
	                            String.format(template, name));

	    }
}

