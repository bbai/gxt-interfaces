package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IMenuItem;

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public class VMenuItem extends MenuItem implements IMenuItem{
	
	public VMenuItem(){
		this.canActivate = true;
	}
	
	/**
	 * Creates a new item with the given text.
	 * @param text the item's text
	 */
	public VMenuItem( final String text ){
		super( text );
	}
	
	/**
	 * Creates a new item.
	 * @param text the item text
	 * @param listener the selection listener
	 */
	public VMenuItem( final String text, final SelectionListener< ? extends MenuEvent > listener ){
		super( text, listener );
	}
	
	/**
	 * Creates a new item.
	 * @param text the item's text
	 * @param icon the item's icon
	 */
	public VMenuItem( final String text, final AbstractImagePrototype icon ){
		super( text, icon );
	}
	
	/**
	 * Creates a new item.
	 * @param text the item's text
	 * @param icon the item's icon
	 * @param listener the selection listener
	 */
	public VMenuItem( final String text, final AbstractImagePrototype icon, final SelectionListener< ? extends MenuEvent > listener ){
		super( text, icon, listener );
	}
	
	//
	public MenuItem getComponent(){
		return this;
	}
	
}
