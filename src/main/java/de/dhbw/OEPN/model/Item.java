package de.dhbw.OEPN.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

	@SerializedName("href")
	@Expose
	private String href;
	@SerializedName("uid")
	@Expose
	private String uid;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("expand")
	@Expose
	private String expand;
	@SerializedName("provider")
	@Expose
	private Provider provider;
	@SerializedName("providerAreaId")
	@Expose
	private Integer providerAreaId;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("geometry")
	@Expose
	private Geometry geometry;
	@SerializedName("address")
	@Expose
	private Address address;
	@SerializedName("rentalObjectTypes")
	@Expose
	private List<String> rentalObjectTypes = null;
	@SerializedName("_links")
	@Expose
	private List<Link> links = null;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Integer getProviderAreaId() {
		return providerAreaId;
	}

	public void setProviderAreaId(Integer providerAreaId) {
		this.providerAreaId = providerAreaId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getRentalObjectTypes() {
		return rentalObjectTypes;
	}

	public void setRentalObjectTypes(List<String> rentalObjectTypes) {
		this.rentalObjectTypes = rentalObjectTypes;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}