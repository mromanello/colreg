package eu.dariah.de.colreg.pojo;

import java.util.List;
import java.util.Map;

import eu.dariah.de.colreg.model.base.BaseIdentifiable;

public class CollectionPojo extends BaseIdentifiable {
	private static final long serialVersionUID = -5544026876984535637L;

	private String entityId;
	private String versionId;
	private Long versionTimestamp;
	private String parentEntityId;
	private String state;
	private String type;
	private String title;
	private Map<String, String> titles;
	private String access;
	private String lastChanged;
	private List<AccessPojo> accessPojos;
	
	
	public String getVersionId() { return versionId; }
	public void setVersionId(String versionId) { this.versionId = versionId; }
	
	public Long getVersionTimestamp() { return versionTimestamp; }
	public void setVersionTimestamp(Long versionTimestamp) { this.versionTimestamp = versionTimestamp; }
	
	public String getEntityId() { return entityId; }
	public void setEntityId(String entityId) { this.entityId = entityId; }
	
	public String getParentEntityId() { return parentEntityId; }
	public void setParentEntityId(String parentEntityId) { this.parentEntityId = parentEntityId; }
	
	public String getState() { return state; }
	public void setState(String state) { this.state = state; }
	
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public Map<String, String> getTitles() { return titles; }
	public void setTitles(Map<String, String> titles) { this.titles = titles; }
	
	public String getAccess() { return access; }
	public void setAccess(String access) { this.access = access; }
	
	public String getLastChanged() { return lastChanged; }
	public void setLastChanged(String lastChanged) { this.lastChanged = lastChanged; }
	
	public List<AccessPojo> getAccessPojos() { return accessPojos; }
	public void setAccessPojos(List<AccessPojo> accessPojos) { this.accessPojos = accessPojos; }
}
