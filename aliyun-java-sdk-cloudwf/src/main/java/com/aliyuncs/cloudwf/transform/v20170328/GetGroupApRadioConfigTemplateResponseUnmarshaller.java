/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.GetGroupApRadioConfigTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupApRadioConfigTemplateResponseUnmarshaller {

	public static GetGroupApRadioConfigTemplateResponse unmarshall(GetGroupApRadioConfigTemplateResponse getGroupApRadioConfigTemplateResponse, UnmarshallerContext context) {
		
		getGroupApRadioConfigTemplateResponse.setRequestId(context.stringValue("GetGroupApRadioConfigTemplateResponse.RequestId"));
		getGroupApRadioConfigTemplateResponse.setSuccess(context.booleanValue("GetGroupApRadioConfigTemplateResponse.Success"));
		getGroupApRadioConfigTemplateResponse.setMessage(context.stringValue("GetGroupApRadioConfigTemplateResponse.Message"));
		getGroupApRadioConfigTemplateResponse.setData(context.stringValue("GetGroupApRadioConfigTemplateResponse.Data"));
		getGroupApRadioConfigTemplateResponse.setErrorCode(context.integerValue("GetGroupApRadioConfigTemplateResponse.ErrorCode"));
		getGroupApRadioConfigTemplateResponse.setErrorMsg(context.stringValue("GetGroupApRadioConfigTemplateResponse.ErrorMsg"));
	 
	 	return getGroupApRadioConfigTemplateResponse;
	}
}