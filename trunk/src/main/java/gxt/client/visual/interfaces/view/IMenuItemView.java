package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public interface IMenuItemView extends IItemView{
	
	/**
	 * Expands the item's sub menu.
	 */
	void expandMenu();
	
	/**
	 * Returns the item's icon style.
	 * @return the icon style
	 */
	AbstractImagePrototype getIcon();
	
	/**
	 * Returns the item's sub menu.
	 * @return the sub menu
	 */
	Menu getSubMenu();
	
	/**
	 * Returns the item's text.
	 * @return the text
	 */
	String getText();
	
	/**
	 * Sets the item's icon style. The style name should match a CSS style that specifies a background image using the following format:
	 * 
	 * <pre>
	 * &lt;code&gt;
	 * .my-icon {
	 *    background: url(images/icons/my-icon.png) no-repeat center left !important;
	 * }
	 * &lt;/code&gt;
	 * </pre>
	 * @param icon the icon
	 */
	void setIcon( AbstractImagePrototype icon );
	
	void setIconStyle( String icon );
	
	/**
	 * Sets the item's sub menu.
	 * @param menu the sub menu
	 */
	void setSubMenu( Menu menu );
	
	/**
	 * Sets the item's text.
	 * @param text the text
	 */
	void setText( String text );
	
}
