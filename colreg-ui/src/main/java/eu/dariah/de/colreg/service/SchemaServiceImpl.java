package eu.dariah.de.colreg.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import eu.dariah.de.colreg.model.vocabulary.EncodingScheme;
import eu.dariah.de.minfba.core.metamodel.serialization.SerializableSchemaContainer;

@Component
public class SchemaServiceImpl implements SchemaService {
	protected static final Logger logger = LoggerFactory.getLogger(SchemaServiceImpl.class);
	
	@Autowired private RestTemplate restTemplate;
	
	@Value("${api.schereg.schemas}")
	private String fetchAllUrl;
	
	@Value("${api.schereg.schemaLink}")
	private String schemaLinkUrl;
		
	
	@Override
	public List<EncodingScheme> findAllSchemas() {
		try {
			SerializableSchemaContainer[] result = restTemplate.getForObject(fetchAllUrl, (new SerializableSchemaContainer[0]).getClass());
			if (result==null) {
				return null;
			}
			List<EncodingScheme> s = new ArrayList<EncodingScheme>(result.length);
			EncodingScheme pojo;
			for (int i=0; i<result.length;i++) {
				pojo = new EncodingScheme();
				pojo.setId(result[i].getSchema().getId());
				pojo.setUrl(String.format(schemaLinkUrl, result[i].getSchema().getId()));
				pojo.setName(result[i].getSchema().getLabel());
				
				s.add(pojo);
			}
			return s;
		} catch (Exception e) {
			logger.error(String.format("Error while executing [%s]", fetchAllUrl), e);
			return null;
		}
	}
}
