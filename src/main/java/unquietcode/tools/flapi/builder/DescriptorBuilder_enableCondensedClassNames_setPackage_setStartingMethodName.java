
package unquietcode.tools.flapi.builder;

import unquietcode.tools.flapi.Descriptor;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on September 01, 2012 18:27:59 CDT using version 0.2
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "September 01, 2012 18:27:59 CDT", comments = "generated using Flapi, the fluent API generator for Java")
public interface DescriptorBuilder_enableCondensedClassNames_setPackage_setStartingMethodName<_ReturnType >{


    DescriptorBuilder_enableCondensedClassNames_setStartingMethodName<_ReturnType> setPackage(String packageName);

    Descriptor build();

    MethodBuilder_addBlockChain<BlockBuilder<DescriptorBuilder_enableCondensedClassNames_setPackage_setStartingMethodName<_ReturnType>>> startBlock(String blockName, String methodSignature);

    DescriptorBuilder_setPackage_setStartingMethodName<_ReturnType> enableCondensedClassNames();

    DescriptorBuilder_enableCondensedClassNames_setPackage<_ReturnType> setStartingMethodName(String methodName);

    MethodBuilder_addBlockChain<DescriptorBuilder_enableCondensedClassNames_setPackage_setStartingMethodName<_ReturnType>> addMethod(String methodSignature);

}
