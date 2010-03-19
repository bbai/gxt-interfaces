package gxt.client.visual.interfaces;

import gxt.client.visual.IBindedPagingToolbar;

import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar.PagingToolBarImages;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar.PagingToolBarMessages;

/**
 * @author eugenp
 */
public interface IPagingToolBar extends IToolBar, IBindedPagingToolbar{
	
	/**
	 * Binds the toolbar to the loader.
	 * @param loader the loader
	 */
	void bind( final PagingLoader< ? > loader );
	
	/**
	 * Clears the current toolbar text.
	 */
	void clear();
	
	/**
	 * Moves to the first page.
	 */
	void first();
	
	/**
	 * Returns the active page.
	 * @return the active page
	 */
	int getActivePage();
	
	PagingToolBarImages getImages();
	
	/**
	 * Returns the tool bar's messages.
	 * @return the messages
	 */
	PagingToolBarMessages getMessages();
	
	/**
	 * Returns the current page size.
	 * @return the page size
	 */
	int getPageSize();
	
	/**
	 * Returns the total number of pages.
	 * @return the
	 */
	int getTotalPages();
	
	/**
	 * Returns true if the previous load config is reused.
	 * @return the reuse config state
	 */
	boolean isReuseConfig();
	
	/**
	 * Returns true if tooltip are enabled.
	 * @return the show tooltip state
	 */
	boolean isShowToolTips();
	
	/**
	 * Moves to the last page.
	 */
	void last();
	
	/**
	 * Moves to the last page.
	 */
	void next();
	
	/**
	 * Moves the the previous page.
	 */
	void previous();
	
	/**
	 * Refreshes the data using the current configuration.
	 */
	void refresh();
	
	/**
	 * Sets the active page (1 to page count inclusive).
	 * @param page the page
	 */
	void setActivePage( int page );
	
	void setImages( final PagingToolBarImages images );

	/**
	 * Sets the tool bar's messages.
	 * @param messages the messages
	 */
	void setMessages( final PagingToolBarMessages messages );
	
	/**
	 * Sets the current page size. This method does not effect the data currently being displayed. The new page size will not be used until the next load request.
	 * @param pageSize the new page size
	 */
	void setPageSize( final int pageSize );
	
	/**
	 * True to reuse the previous load config (defaults to true).
	 * @param reuseConfig true to reuse the load config
	 */
	void setReuseConfig( final boolean reuseConfig );
	
	/**
	 * Sets if the button tool tips should be displayed (defaults to true, pre-render).
	 * @param showToolTips true to show tool tips
	 */
	void setShowToolTips( final boolean showToolTips );

}
