package com.codeyz.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@Scope("singleton")
public class ActionHandler {

    @Autowired
    private Set<Action> actionsSet;
    private Map<String, Action> actions;

    @PostConstruct
    private void setToMap() {
        actions = actionsSet.stream().collect(Collectors.toMap(Action::getKey, e -> e));
    }

    public Action getAction(String name) {
        return actions.get(name);
    }

}
