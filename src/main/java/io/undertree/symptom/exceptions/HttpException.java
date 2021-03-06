/*
 * Copyright 2016-2017 Shawn Sherwood
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

package io.undertree.symptom.exceptions;

/**
 * Base Exception class for extension.
 *
 * @author Shawn Sherwood
 */
abstract class HttpException extends RuntimeException {

	static final long serialVersionUID = 20170227L;

	private final String resource;

	HttpException(String message) {
		this(null, message);
	}

	HttpException(String resource, String message) {
		super(message);
		this.resource = resource;
	}

	HttpException(String resource, String message, Throwable cause) {
		super(message, cause);
		this.resource = resource;
	}

	public String getResource() {
		return this.resource;
	}
}
