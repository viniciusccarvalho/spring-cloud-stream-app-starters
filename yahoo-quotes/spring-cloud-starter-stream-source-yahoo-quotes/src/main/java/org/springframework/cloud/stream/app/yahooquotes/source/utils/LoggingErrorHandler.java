/*
 *  Copyright 2016 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.cloud.stream.app.yahooquotes.source.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * @author Vinicius Carvalho
 */
public class LoggingErrorHandler implements ResponseErrorHandler {

	private Logger logger = LoggerFactory.getLogger(LoggingErrorHandler.class);

	@Override
	public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
		logger.error("Server replied with an error {}",clientHttpResponse.getRawStatusCode());
		return false;
	}

	@Override
	public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

	}
}
