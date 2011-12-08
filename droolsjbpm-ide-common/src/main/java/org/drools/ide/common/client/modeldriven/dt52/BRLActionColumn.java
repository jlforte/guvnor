/*
 * Copyright 2011 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.ide.common.client.modeldriven.dt52;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.ide.common.client.modeldriven.brl.IAction;
import org.drools.ide.common.client.modeldriven.brl.templates.InterpolationVariable;

/**
 * An Action column defined with a BRL fragment
 */
public class BRLActionColumn extends ActionCol52
    implements
    BRLColumn<IAction> {

    private static final long                   serialVersionUID = 540l;

    private List<IAction>                       definition       = new ArrayList<IAction>();

    private Map<InterpolationVariable, Integer> variables        = new HashMap<InterpolationVariable, Integer>();

    public List<IAction> getDefinition() {
        return this.definition;
    }

    public void setDefinition(List<IAction> definition) {
        this.definition = definition;
    }

    public Map<InterpolationVariable, Integer> getVariables() {
        return this.variables;
    }

    public void setVariables(Map<InterpolationVariable, Integer> variables) {
        this.variables = variables;
    }

}