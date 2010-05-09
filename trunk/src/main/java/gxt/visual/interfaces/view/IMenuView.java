package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Item;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IMenuView extends IContainerView< Component >{
	
	/**
	 * Adds a item to the menu.
	 * @param item the new item
	 */
	boolean add( Component item );
	
	/**
	 * Returns the default alignment.
	 * @return the default align
	 */
	String getDefaultAlign();
	
	El getLayoutTarget();
	
	int getMaxHeight();
	
	/**
	 * Returns the menu's minimum width.
	 * @return the width
	 */
	int getMinWidth();
	
	/**
	 * Returns the menu's parent item.
	 * @return the parent item
	 */
	Item getParentItem();
	
	/**
	 * Returns the sub menu alignment.
	 * @return the alignment
	 */
	String getSubMenuAlign();
	
	/**
	 * Hides the menu.
	 */
	void hide();
	
	/**
	 * Hides this menu and optionally all parent menus
	 * @param deep true to close all parent menus
	 * @return this
	 */
	Menu hide( boolean deep );
	
	/**
	 * Inserts an item into the menu.
	 * @param item the item to insert
	 * @param index the insert location
	 */
	boolean insert( Component item, int index );
	
	/**
	 * Returns true if constrain to viewport is enabled.
	 * @return the constrain to viewport state
	 */
	boolean isConstrainViewport();
	
	boolean isEnableScrolling();
	
	boolean isFocusOnShow();
	
	boolean isVisible();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a item from the menu.
	 * @param item the menu to remove
	 */
	boolean remove( Component item );
	
	/**
	 * Sets whether the menu should be constrained to the viewport when shown. Only applies when using {@link #showAt(int, int)}.
	 * @param constrainViewport true to contrain
	 */
	void setConstrainViewport( boolean constrainViewport );
	
	/**
	 * Sets the default {@link El#alignTo} anchor position value for this menu relative to its element of origin (defaults to "tl-bl?").
	 * @param defaultAlign the default align
	 */
	void setDefaultAlign( String defaultAlign );
	
	void setEnableScrolling( boolean enableScrolling );
	
	void setFocusOnShow( boolean focusOnShow );
	
	void setMaxHeight( int maxHeight );
	
	/**
	 * Sets he minimum width of the menu in pixels (defaults to 120).
	 * @param minWidth the min width
	 */
	void setMinWidth( int minWidth );
	
	/**
	 * The {@link El#alignTo} anchor position value to use for submenus of this menu (defaults to "tl-tr-?").
	 * @param subMenuAlign the sub alignment
	 */
	void setSubMenuAlign( String subMenuAlign );
	
	/**
	 * Displays this menu relative to another element.
	 * @param elem the element to align to
	 * @param pos the {@link El#alignTo} anchor position to use in aligning to the element (defaults to defaultAlign)
	 */
	void show( Element elem, String pos );
	
	/**
	 * Displays this menu relative to another element.
	 * @param elem the element to align to
	 * @param pos the {@link El#alignTo} anchor position to use in aligning to the element (defaults to defaultAlign)
	 * @param offsets the menu align offsets
	 */
	void show( Element elem, String pos, int[] offsets );
	
	/**
	 * Displays this menu relative to the widget using the default alignment.
	 * @param widget the align widget
	 */
	void show( Widget widget );
	
	/**
	 * Displays this menu at a specific xy position.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	void showAt( int x, int y );
	
	void setActiveItem( Component c, boolean autoExpand );
	
}
