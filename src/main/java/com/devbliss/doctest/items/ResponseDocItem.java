/*
 * Copyright 2013, devbliss GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.devbliss.doctest.items;

import java.util.Map;

import de.devbliss.apitester.ApiResponse;

public class ResponseDocItem implements DocItem {

    private final int responseCode;
    private final JsonDocItem payload;
    private final Map<String, String> headers;
    private final Map<String, String> docs;

    public ResponseDocItem(ApiResponse response, String payload, Map<String, String> headers, Map<String, String> docs) {
        this.responseCode = response.httpStatus;
        this.payload = new JsonDocItem(payload);
        this.headers = headers;
        this.docs = docs;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public JsonDocItem getPayload() {
        return payload;
    }

    @Override
    public String getItemName() {
        return "response";
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, String> getDocs() {
        return docs;
    }
}
