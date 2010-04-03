package gxt.client.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface IHeaderMenuItemView extends IItemView{
	
	/**
	 * Returns the item's text.
	 * @return the item text
	 */
	String getText();
	
	/**
	 * Sets the item's text.
	 * @param text the item's text
	 */
	void setText( String text );
	
}
