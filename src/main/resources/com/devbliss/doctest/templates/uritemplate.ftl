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
<pre>
${uriTemplate}
</pre>
<table border="1">
<tr><th>Parameter</th><th>Description</th><th>example value</th></tr>
<#list params?keys as key>
<tr>
    <td>${key}</td>
    <td>${docs[key]}</td>
    <td>${params[key]}</td>
</tr>
</#list>
</table>
<pre>
${uri}
</pre>
