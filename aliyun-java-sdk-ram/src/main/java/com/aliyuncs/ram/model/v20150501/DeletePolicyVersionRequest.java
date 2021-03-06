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
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class DeletePolicyVersionRequest extends RpcAcsRequest<DeletePolicyVersionResponse> {
	
	public DeletePolicyVersionRequest() {
		super("Ram", "2015-05-01", "DeletePolicyVersion");
		setProtocol(ProtocolType.HTTPS);
	}

	private String policyName;

	private String versionId;

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		putQueryParameter("PolicyName", policyName);
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		putQueryParameter("VersionId", versionId);
	}

	@Override
	public Class<DeletePolicyVersionResponse> getResponseClass() {
		return DeletePolicyVersionResponse.class;
	}

}
