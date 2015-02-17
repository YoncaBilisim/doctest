<#-- 
  Copyright 2013, devbliss GmbH
  
  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
  in compliance with the License. You may obtain a copy of the License at
  
  http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software distributed under the License
  is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
  or implied. See the License for the specific language governing permissions and limitations under
  the License.
 #-->
<div class="box">
	<span class="headline">Response Document</span>

<#if docs?? && docs?has_content>
<li>ResponseCode: ${responseCode}</li>
<table border="1">
<tr><th>Attribute</th><th>Description</th></tr>
<#list docs?keys as key>
<tr>
    <td>${key}</td>
    <td>${docs[key]}</td>
</tr>
</#list>
</table>
</#if>

	<span class="headline">Response</span>
	<ul>
		<li>ResponseCode: ${responseCode}</li>

		<#if headers?has_content>
			<li>Headers
				<ol>
				<#list headers?keys as header>
				    <li>
				        <label>${header} = </label>
				        <div>${headers[header]}</div>
				    </li>
				</#list>
				</ol>
			</li>
		</#if>

		<#if payload?? && payload.expected?has_content && payload.expected != "" && payload.expected != "null" && payload.expected != "{}" >
			<li>
				<div>payload:</div>
				<pre>${payload.expected}</pre>
			</li>
		</#if>
    </ul>
</div>