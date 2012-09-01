
package unquietcode.tools.flapi.builder;

import unquietcode.tools.flapi.Descriptor;
import unquietcode.tools.flapi.support.v0_2.BuilderImplementation;
import unquietcode.tools.flapi.support.v0_2.ExpectedInvocationsException;
import unquietcode.tools.flapi.support.v0_2.ObjectWrapper;

import javax.annotation.Generated;
import java.lang.reflect.Field;


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
public class ImplDescriptorBuilder_setPackage_setStartingMethodName
    implements DescriptorBuilder_setPackage_setStartingMethodName, BuilderImplementation
{

    private final DescriptorHelper _helper;
    private final Object _returnValue;
    int ic_Descriptor_setPackage$String_packageName = 1;

    ImplDescriptorBuilder_setPackage_setStartingMethodName(DescriptorHelper helper, Object returnValue) {
        _helper = helper;
        _returnValue = returnValue;
    }

    public BuilderImplementation _getParent() {
        if (_returnValue instanceof BuilderImplementation) {
            return ((BuilderImplementation) _returnValue);
        } else {
            return null;
        }
    }

    private void _transferInvocations(Object next) {
        Class clazz = next.getClass();
         
        try {
            Field field = clazz.getDeclaredField("ic_Descriptor_setPackage$String_packageName");
            field.setInt(next, ic_Descriptor_setPackage$String_packageName);
        } catch (Exception _x) {
            // nothing
        }
    }

    public void _checkInvocations() {
        if (ic_Descriptor_setPackage$String_packageName > 0) {
            throw new ExpectedInvocationsException("Expected at least 1 invocations of method 'setPackage(String packageName)'.");
        }
    }

    public DescriptorBuilder_setPackage setStartingMethodName(String methodName) {
        _helper.setStartingMethodName(methodName);
        ImplDescriptorBuilder_setPackage step1 = new ImplDescriptorBuilder_setPackage(_helper, _returnValue);
         
        _transferInvocations(step1);
        return step1;
    }

    public Descriptor build() {
        BuilderImplementation cur = this;
        while (cur!= null) {
            cur._checkInvocations();
            cur = cur._getParent();
        }
         
        Descriptor intermediateResult = _helper.build();
         
        return intermediateResult;
    }

    public MethodBuilder_addBlockChain addMethod(String methodSignature) {
        ObjectWrapper<MethodHelper> helper1 = new ObjectWrapper<MethodHelper>();
        _helper.addMethod(methodSignature, helper1);
        ImplMethodBuilder_addBlockChain step1 = new ImplMethodBuilder_addBlockChain(helper1 .get(), this);
         
        return step1;
    }

    public DescriptorBuilder_setStartingMethodName setPackage(String packageName) {
        --ic_Descriptor_setPackage$String_packageName;
        _helper.setPackage(packageName);
        ImplDescriptorBuilder_setStartingMethodName step1 = new ImplDescriptorBuilder_setStartingMethodName(_helper, _returnValue);
         
        _transferInvocations(step1);
        return step1;
    }

    public MethodBuilder_addBlockChain startBlock(String blockName, String methodSignature) {
        ObjectWrapper<MethodHelper> helper1 = new ObjectWrapper<MethodHelper>();
        ObjectWrapper<BlockHelper> helper2 = new ObjectWrapper<BlockHelper>();
        _helper.startBlock(blockName, methodSignature, helper1, helper2);
        ImplBlockBuilder step1 = new ImplBlockBuilder(helper2 .get(), this);
        ImplMethodBuilder_addBlockChain step2 = new ImplMethodBuilder_addBlockChain(helper1 .get(), step1);
         
        return step2;
    }

}
