
package unquietcode.tools.flapi.builder;

import javax.annotation.Generated;
import unquietcode.tools.flapi.Descriptor;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 28, 2012 17:01:37 CDT using version 0.2
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "May 28, 2012 17:01:37 CDT", comments = "generated using Flapi, the fluent API generator for Java")
public interface DescriptorHelper {


    Descriptor _getReturnValue();

    void setReturnType(Class returnType);

    void setDescriptorName(String descriptorName);

    void startBlock(String blockName, String methodSignature, ObjectWrapper<MethodHelper> _helper1, ObjectWrapper<BlockHelper> _helper2);

    void enableCondensedClassNames(boolean value);

    void setStartingMethodName(String methodName);

    void setPackage(String packageName);

    void addMethod(String methodSignature, ObjectWrapper<MethodHelper> _helper1);

    void build();

}
