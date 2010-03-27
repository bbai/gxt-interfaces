package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.custom.Portlet;

/**
 * @author eugenp
 */
public interface IPortalView extends IContainerView< LayoutContainer >{
	
	/**
	 * Adds a portlet to the portal.
	 * @param portlet the portlet to add
	 * @param column the column to insert into
	 */
	void add( Portlet portlet, int column );
	
	/**
	 * Returns the column of the given porlet.
	 * @param portlet the portlet
	 * @return the column or -1 if not found
	 */
	int getPortletColumn( Portlet portlet );
	
	/**
	 * Returns the index of the column for the given portlet.
	 * @param portlet the portlet
	 * @return the index or -1 if not found
	 */
	int getPortletIndex( Portlet portlet );
	
	/**
	 * Returns the spacing between portlets.
	 * @return the spacing the spacing in pixels
	 */
	int getSpacing();
	
	/**
	 * Inserts a portlet.
	 * @param portlet the portlet to add
	 * @param index the insert index
	 * @param column the column to insert into
	 */
	void insert( Portlet portlet, int index, int column );
	
	/**
	 * Removes a portlet from the portal.
	 * @param portlet the porlet to remove
	 * @param column the column
	 */
	void remove( Portlet portlet, int column );
	
	/**
	 * True to adjust the layout for a vertical scroll bar (defaults to true).
	 * @param adjust true to adjust
	 */
	void setAdjustForScroll( boolean adjust );
	
	/**
	 * Sets the column's width.
	 * @param colIndex the column index
	 * @param width the column width
	 */
	void setColumnWidth( int colIndex, double width );
	
	/**
	 * Sets the spacing between portlets (defaults to 10).
	 * @param spacing the spacing in pixels
	 */
	void setSpacing( int spacing );
	
}
