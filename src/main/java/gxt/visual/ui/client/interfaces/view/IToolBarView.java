package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IToolBarView extends IContainerView< Component >{
	
	/**
	 * Adds a item to the tool bar.
	 * @param item the item to add
	 */
	boolean add( Component item );
	
	/**
	 * Returns the alignment of the items.
	 * @return the alignment
	 */
	HorizontalAlignment getAlignment();
	
	/**
	 * Returns the min button width.
	 * @return the min button width
	 */
	int getMinButtonWidth();
	
	/**
	 * Returns the child component spacing.
	 * @return the spacing
	 */
	int getSpacing();
	
	/**
	 * Inserts a item into the tool bar.
	 * @param item the item to add
	 * @param index the insert location
	 */
	boolean insert( Component item, int index );
	
	/**
	 * Returns true if overflow is enabled.
	 * @return the overflow state
	 */
	boolean isEnableOverflow();
	
	boolean layout();
	
	/**
	 * Removes a component from the tool bar.
	 * @param item the item to be removed
	 */
	boolean remove( Component item );
	
	/**
	 * Sets the ailgnment of the items. (defaults to LEFT, pre-render).
	 * @param alignment the alignment to set
	 */
	void setAlignment( HorizontalAlignment alignment );
	
	/**
	 * Sets the minWidth for any Component of type Button
	 * @param minButtonWidth the min button width to set
	 */
	void setMinButtonWidth( int minButtonWidth );
	
	/**
	 * True to show a drop down icon when the available width is less than the required width (defaults to true).
	 * @param enableOverflow true to enable overflow support
	 */
	void setEnableOverflow( boolean enableOverflow );
	
	/**
	 * Sets the spacing between child items (defaults to 0).
	 * @param spacing the spacing
	 */
	void setSpacing( int spacing );
	
	void onComponentEvent( ComponentEvent ce );

}
