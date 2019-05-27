package de.dhbw.OEPN.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeRequest {

	@SerializedName("href")
	@Expose
	private String href;
	@SerializedName("offset")
	@Expose
	private Integer offset;
	@SerializedName("limit")
	@Expose
	private Integer limit;
	@SerializedName("size")
	@Expose
	private Integer size;
	@SerializedName("items")
	@Expose
	private List<Item> items = null;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}