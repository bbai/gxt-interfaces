package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface IHtmlView extends IBoxComponentView{
	
	/**
	 * Returns the component's HTML.
	 * @return the html
	 */
	String getHtml();
	
	/**
	 * @return the tagName
	 */
	String getTagName();
	
	/**
	 * Sets the components HTML.
	 * @param html the html
	 */
	void setHtml( String html );
	
	/**
	 * The HTML tag name that will wrap the text (defaults to 'div'). For inline behavior set the tag name to 'span'.
	 * @param tagName the new tag name
	 */
	void setTagName( String tagName );
	
}
