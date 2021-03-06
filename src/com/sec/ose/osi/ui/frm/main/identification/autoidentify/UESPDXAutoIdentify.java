/**
 * Copyright(C) 2010-2014 Samsung Electronics Co., Ltd. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package com.sec.ose.osi.ui.frm.main.identification.autoidentify;

import java.util.List;

import com.sec.ose.airs.domain.autoidentify.AutoIdentifyOptions;
import com.sec.ose.osi.ui.cache.UIEntity;

/**
 * UESPDXAutoIdentify
 * @author sjh.yoo, ytaek.kim
 * 
 */
public class UESPDXAutoIdentify implements UIEntity {
	private static final long serialVersionUID = 1L;
	
	String projectName;
	List<String> SPDXFilePathList;
	AutoIdentifyOptions autoIdentifyOptions;

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<String> getSPDXFilePathList() {
		return SPDXFilePathList;
	}
	public void setSPDXFilePathList(List<String> sPDXFilePathList) {
		SPDXFilePathList = sPDXFilePathList;
	}
	public AutoIdentifyOptions getAutoIdentifyOptions() {
		return autoIdentifyOptions;
	}
	public void setAutoIdentifyOptions(AutoIdentifyOptions autoIdentifyOptions) {
		this.autoIdentifyOptions = autoIdentifyOptions;
	}
	
	
	
}
