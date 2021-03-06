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

/**
 * A {@link DocItem} is a part of a report which could appear several times in it. In other words, a
 * report is an sorted amount of {@link DocItem}.
 * 
 * <h1>Utility</h1>
 * <p>
 * We need this common interface to have the possibility to treat all the {@link DocItem} the same
 * way. It allows us to create a 'logic' report as a list of {@link DocItem}. This does not depend
 * on the output format and can be easily generated / tested / improved.
 * </p>
 * <h1>Example</h1>
 * <p>
 * The following example shows a possible way to use the {@link DocItem};<br/>
 * <code>
 * List<DocItem> listItems = new ArrayList<DocItem>();<br/>
 * listItems.add(new SectionDocItem("test the delete Request"));<br/>
 * listItems.add(new RequestDocItem(DELETE, "http://www.google.com", null));
 * listItems.add(new ResponseDocItem(401, "you can not delete google"));
 * 
 * htmlRenderer.render(listItems);<br/><br/>
 * </code> This example will create am html report containing:
 * <ul>
 * <li>a section which title is "test the delete Request"</li>
 * <li>a request section containing the informations about the request</li>
 * <li>a response section containing the informations about the response</li>
 * </ul>
 * </p>
 * <p>
 * If you need a new {@link DocItem}, just create a new implementation of {@link DocItem}.
 * </p>
 * 
 * @author bmary
 * 
 */
public interface DocItem {

    public String getItemName();
}
