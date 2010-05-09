package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * @author eugenp
 */
public interface IMenuItemView extends IItemView{
	
	/**
	 * Expands the item's sub menu.
	 */
	void expandMenu();
	
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
