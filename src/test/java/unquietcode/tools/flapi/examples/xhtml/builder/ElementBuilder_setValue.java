
package unquietcode.tools.flapi.examples.xhtml.builder;



/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 09, 2012 23:44:26 CDT using version 0.1
 * 
 */
public interface ElementBuilder_setValue<_ReturnType >{


    ElementBuilder_setValue<_ReturnType> addAttribute(String key, String value);

    ElementBuilder_setValue<_ReturnType> addComment(String comment);

    _ReturnType endElement();

    ElementBuilder_setValue<ElementBuilder_setValue<_ReturnType>> startElement(String tagName);

    ElementBuilder<_ReturnType> setValue(String value);

}