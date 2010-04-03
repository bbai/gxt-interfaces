package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * @author eugenp
 */
public interface IItemView extends IComponentView{
	
	/**
	 * Adds a selection listener.
	 * @param listener the listener to add
	 */
	void addSelectionListener( SelectionListener< ? extends MenuEvent > listener );
	
	/**
	 * Returns the active style.
	 * @return the style
	 */
	String getActiveStyle();
	
	/**
	 * Returns the hide on click state.
	 * @return the hide on click state
	 */
	boolean getHideOnClick();
	
	/**
	 * Returns the item's containing menu.
	 * @return the menu
	 */
	Menu getParentMenu();
	
	/**
	 * Removes a previously added listener.
	 * @param listener the listener to be removed
	 */
	void removeSelectionListener( SelectionListener< ? extends ComponentEvent > listener );
	
	/**
	 * The CSS class to use when the item becomes activated (defaults to "x-menu-item-active").
	 * @param activeStyle the active style
	 */
	void setActiveStyle( String activeStyle );
	
	/**
	 * True to hide the containing menu after this item is clicked (defaults to true).
	 * @param hideOnClick true to hide, otherwise false
	 */
	void setHideOnClick( boolean hideOnClick );
	
}
