package com.AutoSuggest.Controller;

public class Suggest {
	 private final long id;
	    private final String content;

	    public Suggest(long id, String content) {
	        this.id = id;
	        this.content = content;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getContent() {
	        return content;
	    }

}
