/*
 * Copyright 2014 devbliss GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devbliss.doctest.items;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author myururdurmaz
 */
public class URITemplateDocItem implements DocItem {

    private String uriTemplate;
    private Map<String, String> params;
    private Map<String, String> docs;

    public URITemplateDocItem(String uriTemplate, Map<String, String> params, Map<String, String> docs) {
        this.uriTemplate = uriTemplate;
        this.params = params;
        this.docs = docs;
    }

    public String getUriTemplate() {
        return uriTemplate;
    }

    public Map<String, String> getDocs() {
        return docs;
    }

    public Map<String, String> getParams() {
        return params;
    }
    
    public String getUri() {
        String ret = uriTemplate;
        for (Map.Entry<String, String> entrySet : params.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            ret = ret.replace("{" + key +"}", value);
        }
        return ret;
    }

    @Override
    public String getItemName() {
        return "uritemplate";
    }

}
