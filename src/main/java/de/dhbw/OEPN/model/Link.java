package de.dhbw.OEPN.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {

	@SerializedName("rel")
	@Expose
	private String rel;
	@SerializedName("verb")
	@Expose
	private String verb;
	@SerializedName("href")
	@Expose
	private String href;

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}