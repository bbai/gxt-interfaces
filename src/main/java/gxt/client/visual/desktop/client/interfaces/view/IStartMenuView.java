package gxt.client.visual.desktop.client.interfaces.view;

import gxt.client.visual.interfaces.view.IMenuView;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Item;
import com.google.gwt.user.client.Element;

/**
 * @author eugenp
 */
public interface IStartMenuView extends IMenuView{
	
	/**
	 * Adds a item to the "tool" area of the start menu.
	 * @param item the item to add
	 */
	void addTool( Item item );
	
	/**
	 * Adds a seperator to the "too" area.
	 */
	void addToolSeperator();
	
	Component findItem( Element elem );
	
	El getFocusEl();
	
	/**
	 * Returns the start menu's heading.
	 * @return the heading
	 */
	String getHeading();
	
	/**
	 * Returns the menu's icon style.
	 * @return the icon style
	 */
	String getIconStyle();
	
	El getLayoutTarget();
	
	int getToolWidth();
	
	/**
	 * Sets the menu's heading text.
	 * @param heading the heading
	 */
	void setHeading( String heading );
	
	/**
	 * Sets the menu's icon style.
	 * @param iconStyle the icon style
	 */
	void setIconStyle( String iconStyle );
	
	void setToolWidth( int toolWidth );
	
	void show( Element elem, String pos );
	
}
