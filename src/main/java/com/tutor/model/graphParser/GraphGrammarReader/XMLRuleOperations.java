package com.tutor.model.graphParser.GraphGrammarReader;

/**
 * Created by Wiranji Dinelka on 8/4/2017.
 */
public class XMLRuleOperations {
    private String id;
    private String from_id;

    public XMLRuleOperations() {}

    public XMLRuleOperations(String id, String from_id, String to_id) {
        this.id = id;
        this.from_id = from_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom_id() {
        return from_id;
    }

    public void setFrom_id(String from_id) {
        this.from_id = from_id;
    }

}
