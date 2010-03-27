package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.TabItem.HeaderItem;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.ui.Frame;

/**
 * @author eugenp
 */
public interface ITabItemView extends ILayoutContainerView, IconSupport{
	
	/**
	 * Closes the tab item.
	 */
	void close();
	
	void disable();
	
	void enable();
	
	/**
	 * Returns the item's header component.
	 * @return the header component
	 */
	HeaderItem getHeader();
	
	/**
	 * Returns the item's tab panel.
	 * @return the tab panel
	 */
	TabPanel getTabPanel();
	
	/**
	 * Returns the item's text.
	 * @return the text
	 */
	String getText();
	
	/**
	 * Returns the item's text style name.
	 * @return the style name
	 */
	String getTextStyle();
	
	/**
	 * Returns true if the item can be closed.
	 * @return the closable the close state
	 */
	boolean isClosable();
	
	/**
	 * Sends a remote request and sets the item's content using the returned HTML.
	 * @param requestBuilder the request builder
	 */
	void setAutoLoad( RequestBuilder requestBuilder );
	
	/**
	 * Sets whether the tab may be closed (defaults to false).
	 * @param closable the closable state
	 */
	void setClosable( boolean closable );
	
	/**
	 * Sets the item's text.
	 * @param text the new text
	 */
	void setText( String text );
	
	/**
	 * Sets the style name to be applied to the item's text element.
	 * @param textStyle the style name
	 */
	void setTextStyle( String textStyle );
	
	/**
	 * Sets a url for the content area of the item.
	 * @param url the url
	 * @return the frame widget
	 */
	Frame setUrl( String url );
	
}
