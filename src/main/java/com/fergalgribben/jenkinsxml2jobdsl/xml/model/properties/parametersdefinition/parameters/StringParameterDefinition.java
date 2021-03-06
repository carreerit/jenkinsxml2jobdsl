package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class StringParameterDefinition implements Buildable{

	public String name;
	public String description;
	public String defaultValue;
	
	@Override
	public void build(Builder builder) {
		builder.createMethod("stringParam").withStringParameter(name).withStringParameter(defaultValue).withStringParameter(description).endMethod();
	}
}
