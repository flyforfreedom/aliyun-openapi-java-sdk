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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ReportZoneHourRequest extends RpcAcsRequest<ReportZoneHourResponse> {
	
	public ReportZoneHourRequest() {
		super("cloudwf", "2017-03-28", "ReportZoneHour");
	}

	private String beginDate;

	private String endDate;

	private Long agsid;

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putQueryParameter("BeginDate", beginDate);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public Long getAgsid() {
		return this.agsid;
	}

	public void setAgsid(Long agsid) {
		this.agsid = agsid;
		if(agsid != null){
			putQueryParameter("Agsid", agsid.toString());
		}
	}

	@Override
	public Class<ReportZoneHourResponse> getResponseClass() {
		return ReportZoneHourResponse.class;
	}

}
