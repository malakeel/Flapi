
package unquietcode.tools.flapi.examples.xhtml.builder.XHTML;

import org.w3c.dom.Document;
import unquietcode.tools.flapi.runtime.MethodInfo;
import unquietcode.tools.flapi.runtime.TransitionType;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on August 13, 2014 16:08:21 PDT using version 0.0-DEVELOPMENT
 * @see unquietcode.tools.flapi.examples.xhtml.builder.XHTML.XHTMLHelper
 */
@Generated(value = "unquietcode.tools.flapi", date = "2014-08-13T16:08:21-07:00", comments = "generated using Flapi, the fluent API generator for Java")
public interface XHTMLBuilder_2addComment_2startElement<_ReturnType> {
    @MethodInfo(type = TransitionType.Recursive)
    unquietcode.tools.flapi.examples.xhtml.builder.XHTML.XHTMLBuilder.Start<_ReturnType> addComment(String comment);

    @MethodInfo(type = TransitionType.Terminal)
    Document done();

    @MethodInfo(type = TransitionType.Recursive, chain = {
        unquietcode.tools.flapi.examples.xhtml.builder.Element.ElementBuilder.Start.class
    })
    unquietcode.tools.flapi.examples.xhtml.builder.Element.ElementBuilder.Start<unquietcode.tools.flapi.examples.xhtml.builder.XHTML.XHTMLBuilder.Start<_ReturnType>> startElement(String tagName);
}
