/*******************************************************************************
 Copyright 2013 Benjamin Fagin

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.


     Read the included LICENSE.TXT for more information.
 ******************************************************************************/

package unquietcode.tools.flapi.outline;


import unquietcode.tools.flapi.MethodParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Fagin
 */
public class MethodInfo implements Comparable<MethodInfo> {
	private Integer minOccurrences;
	private Integer maxOccurrences;
	private String methodSignature;
	private String documentation;
	private boolean isDeprecated = false;
	private String deprecationReason;


	public Integer getMinOccurrences() {
		return minOccurrences;
	}

	public void setMinOccurrences(Integer minOccurrences) {
		this.minOccurrences = minOccurrences;
	}

	public Integer getMaxOccurrences() {
		return maxOccurrences;
	}

	public void setMaxOccurrences(Integer maxOccurrences) {
		this.maxOccurrences = maxOccurrences;
	}

	public boolean isDeprecated() {
		return isDeprecated;
	}

	public void setDeprecated(String reason) {
		isDeprecated = true;
		deprecationReason = reason;
	}

	public String getDeprecationReason() {
		return deprecationReason;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getMethodSignature() {
		return methodSignature;
	}

	public void setMethodSignature(String methodSignature) {
		this.methodSignature = methodSignature.trim();
	}

	public String returnType() {
		MethodParser parsed = new MethodParser(methodSignature);
		return parsed.returnType;
	}

	public MethodInfo copy()  {
		MethodInfo clone = new MethodInfo();
		copy(clone);
		return clone;
	}

	protected void copy(MethodInfo other) {
		other.minOccurrences = minOccurrences;
		other.maxOccurrences = maxOccurrences;
		other.methodSignature = methodSignature;
		other.documentation = documentation;
		other.isDeprecated = isDeprecated;
		other.deprecationReason = deprecationReason;
	}

	@Override
	public String toString() {
		return methodSignature + "-" + maxOccurrences;
	}

	/*
		Used by sorted collections to provide consistent ordering.
	 */
	public @Override int compareTo(MethodInfo other) {
		return methodSignature.compareTo(other.methodSignature);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MethodInfo that = (MethodInfo) o;

		if (isDeprecated != that.isDeprecated) return false;
		if (deprecationReason != null ? !deprecationReason.equals(that.deprecationReason) : that.deprecationReason != null)
			return false;
		if (documentation != null ? !documentation.equals(that.documentation) : that.documentation != null)
			return false;
		if (maxOccurrences != null ? !maxOccurrences.equals(that.maxOccurrences) : that.maxOccurrences != null)
			return false;
		if (methodSignature != null ? !methodSignature.equals(that.methodSignature) : that.methodSignature != null)
			return false;
		if (minOccurrences != null ? !minOccurrences.equals(that.minOccurrences) : that.minOccurrences != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = minOccurrences != null ? minOccurrences.hashCode() : 0;
		result = 31 * result + (maxOccurrences != null ? maxOccurrences.hashCode() : 0);
		result = 31 * result + (methodSignature != null ? methodSignature.hashCode() : 0);
		result = 31 * result + (documentation != null ? documentation.hashCode() : 0);
		result = 31 * result + (isDeprecated ? 1 : 0);
		result = 31 * result + (deprecationReason != null ? deprecationReason.hashCode() : 0);
		return result;
	}
}