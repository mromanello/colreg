package eu.dariah.de.colreg.model;

public class AccessMethod {
	private String type;
	private String uri;
	private EncodingScheme scheme;
	
	
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	public String getUri() { return uri; }
	public void setUri(String uri) { this.uri = uri; }
	
	public EncodingScheme getScheme() { return scheme; }
	public void setScheme(EncodingScheme scheme) { this.scheme = scheme; }
}