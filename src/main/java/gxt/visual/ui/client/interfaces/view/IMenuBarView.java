package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

/**
 * A horizontal menu bar.
 * @author ADaroussin
 */
public interface IMenuBarView extends IContainerView< MenuBarItem >{
	public boolean add( MenuBarItem item );
	
	public boolean insert( MenuBarItem item, int index );
	
	public void onComponentEvent( ComponentEvent ce );
	
	public boolean remove( MenuBarItem item );

	/**
	 * Sets the active item.
	 * @param item the item to activate
	 * @param expand true to expand the item's menu
	 */
	public void setActiveItem( MenuBarItem item, boolean expand );

	/**
	 * Toggles the given item.
	 * @param item the item to toggle
	 */
	public void toggle( MenuBarItem item );
}
