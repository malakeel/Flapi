
package unquietcode.tools.flapi.examples.xhtml.builder.XHTML;

import unquietcode.tools.flapi.examples.xhtml.builder.XHTML.XHTMLBuilder.$;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on April 19, 2013 18:33:15 PDT using version 0.4
 */
@Generated(value = "unquietcode.tools.flapi", date = "April 19, 2013 18:33:15 PDT", comments = "generated using Flapi, the fluent API generator for Java")
public class XHTMLGenerator {
    @SuppressWarnings("unchecked")
    public static $<Void> createDocument(XHTMLHelper helper) {
        if (helper == null) {
            throw new IllegalArgumentException("Helper cannot be null.");
        }
         
        return (($) new ImplXHTMLBuilder(helper, null));
    }
}