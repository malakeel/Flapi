/*********************************************************************
 Copyright 2014 the Flapi authors

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ********************************************************************/

package unquietcode.tools.flapi.helpers;

import unquietcode.tools.flapi.ClassReference;
import unquietcode.tools.flapi.DescriptorBuilderException;
import unquietcode.tools.flapi.builder.Annotation.AnnotationHelper;
import unquietcode.tools.flapi.outline.MethodOutline;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;


public class AnnotationsHelperImpl implements AnnotationHelper {
    private final MethodOutline method;
    private final Object annotation;
	private final String FQCN;
	private final Map<String, Object> parameters = new LinkedHashMap<String, Object>();

	public AnnotationsHelperImpl(MethodOutline method, Class<? extends Annotation> annotation) {
	    this(method, annotation, annotation.getName());
    }

	public AnnotationsHelperImpl(MethodOutline method, ClassReference annotation) {
		this(method, annotation, annotation.getFQCN());
	}

	private AnnotationsHelperImpl(MethodOutline method, Object annotation, String FQCN) {
		this.method = method;
		this.annotation = annotation;
		this.FQCN = FQCN;
	}

	@Override
	public void withParameter(String name, Class value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, ClassReference value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, Enum value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, String value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, boolean value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, byte value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, double value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, float value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, int value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, long value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, short value) {
		checkAndAdd(name, value);
	}

	@Override
	public void withParameter(String name, Class[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, ClassReference[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, Enum[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, String[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, boolean[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, byte[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, double[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, float[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, int[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, long[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void withParameter(String name, short[] values) {
		checkAndAdd(name, values);
	}

	@Override
	public void finish() {
		if (FQCN.equals(Deprecated.class.getName())) {
			if (!parameters.isEmpty()) {
				throw new DescriptorBuilderException("the @Deprecated annotation does not have any parameters");
			}
			method.setDeprecated(null);
		} else {
			method.addAnnotation(annotation, parameters);
		}
	}

	private void checkAndAdd(String name, Object value) {
		if (name == null || name.trim().isEmpty()) {
			throw new DescriptorBuilderException("a valid parameter name is required");
		}

		if (value == null) {
			throw new DescriptorBuilderException("parameter values cannot be null");
		}

		if (parameters.containsKey(name)) {
			throw new DescriptorBuilderException("duplicate annotation parameter name found: " + name);
		}

		parameters.put(name, value);
	}
}