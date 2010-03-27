package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.Component;
import com.google.gwt.http.client.RequestBuilder.Method;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IHtmlContainerView extends IContainerView< Component >{
	
	/**
	 * Adds a component to this Container. Fires the <i>BeforeAdd</i> event before adding, then fires the <i>Add</i> event after the component has been added.
	 * @param widget the widget to add. If the widget is not a Component it will be wrapped in a WidgetComponent
	 * @param selector the css selector (ie div.class) used to identify the components parent
	 */
	void add( Widget widget, String selector );
	
	/**
	 * Returns the HTTP method. Only applies when specifying a {@link #setUrl(String)}
	 * @return the HTTP method
	 */
	Method getHttpMethod();
	
	/**
	 * Returns the request data.
	 * @return the request data
	 */
	String getRequestData();
	
	/**
	 * @return the tagName
	 */
	String getTagName();
	
	/**
	 * Returns true if defer download is enabled.
	 * @return true for deferred download
	 */
	boolean isDeferDownload();
	
	/**
	 * True to defer remote requests until the component is rendered (defaults to false).
	 * @param deferDownload true to defer
	 */
	void setDeferDownload( boolean deferDownload );
	
	/**
	 * Sets the container's inner html.
	 * @param html the html
	 */
	void setHtml( String html );
	
	/**
	 * The method used when requesting remote content (defaults to RequestBuilder.GET). Only applies when specifying a {@link #setUrl(String)}
	 * @param httpMethod
	 */
	void setHttpMethod( Method httpMethod );
	
	/**
	 * The request data to be used in remote calls (defaults to null).
	 * @param requestData the request data
	 */
	void setRequestData( String requestData );
	
	/**
	 * The HTML tag name that will wrap the text (defaults to 'div'). For inline behavior set the tag name to 'span'.
	 * @param tagName the new tag name
	 */
	void setTagName( String tagName );
	
	/**
	 * Retrieves and sets the container's content from the given url.
	 * @param url the url
	 */
	void setUrl( String url );
	
}
