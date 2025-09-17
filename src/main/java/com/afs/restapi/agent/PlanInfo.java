package com.afs.restapi.agent;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * 规划信息对象，表示单个执行计划
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanInfo {
    
    @JsonProperty("function")
    private String functionName;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("input")
    @JsonAlias({"parameters", "variables"})
    private Map<String, Object> variables;

    private List<PlanStep> steps;

    public List<PlanStep> getSteps() {
        return steps;
    }

    public void setSteps(List<PlanStep> steps) {
        this.steps = steps;
    }
    
    public PlanInfo() {}
    
    public PlanInfo(String functionName, String description, Map<String, Object> variables) {
        this.functionName = functionName;
        this.description = description;
        this.variables = variables;
    }

    public String getFunctionName() {
        return functionName;
    }
    
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "{" +
                " function='" + functionName + '\'' +
                ", description='" + description + '\'' +
                ", variables=" + variables +
                '}';
    }
}
