package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel.TabPanelMessages;
import com.extjs.gxt.ui.client.widget.TabPanel.TabPosition;
import com.extjs.gxt.ui.client.widget.layout.CardLayout;

/**
 * @author eugenp
 */
public interface ITabPanelView extends IContainerView< TabItem >{
	
	/**
	 * Adds a tab item. Fires the <i>BeforeAdd</i> event before inserting, then fires the <i>Add</i> event after the widget has been inserted.
	 * @param item the item to be added
	 */
	boolean add( TabItem item );
	
	/**
	 * Searches for an item based on its id and optionally the item's text.
	 * @param id the item id
	 * @param checkText true to match the items id and text
	 * @return the item
	 */
	TabItem findItem( String id, boolean checkText );
	
	/**
	 * Returns true if scrolling is animated.
	 * @return the anim scroll state
	 */
	boolean getAnimScroll();
	
	/**
	 * Returns true if the body border is enabled.
	 * @return the body border state
	 */
	boolean getBodyBorder();
	
	/**
	 * Returns true if the border style is enabled.
	 * @return the border style
	 */
	boolean getBorderStyle();
	
	CardLayout getLayout();
	
	El getLayoutTarget();
	
	/**
	 * Returns the tab panel messages.
	 * @return the messages
	 */
	TabPanelMessages getMessages();
	
	/**
	 * Returns the minimum tab width.
	 * @return the minimum tab width
	 */
	int getMinTabWidth();
	
	/**
	 * Returns true if tab resizing is enabled.
	 * @return the tab resizing state
	 */
	boolean getResizeTabs();
	
	/**
	 * Returns the scroll duration in milliseconds.
	 * @return the duration
	 */
	int getScrollDuration();
	
	/**
	 * Returns the current selection tab item.
	 * @return the selected item
	 */
	TabItem getSelectedItem();
	
	/**
	 * Returns the panel's tab margin.
	 * @return the margin
	 */
	int getTabMargin();
	
	/**
	 * Returns the tab position.
	 * @return the tab position
	 */
	TabPosition getTabPosition();
	
	/**
	 * Returns true if tab scrolling is enabled.
	 * @return the tab scroll state
	 */
	boolean getTabScroll();
	
	/**
	 * Returns the default tab width.
	 * @return the width
	 */
	int getTabWidth();
	
	/**
	 * Adds a tab item. Fires the <i>BeforeAdd</i> event before inserting, then fires the <i>Add</i> event after the widget has been inserted.
	 * @param item the item to be inserted
	 * @param index the insert position
	 */
	boolean insert( TabItem item, int index );
	
	/**
	 * Returns true if auto select is enabled.
	 * @return the auto select state
	 */
	boolean isAutoSelect();
	
	/**
	 * Returns true if close context menu is enabled.
	 * @return the close menu state
	 */
	boolean isCloseContextMenu();
	
	/**
	 * Returns true if children items are rendered when first accessed.
	 * @return true to defer rendering
	 */
	boolean isDeferredRender();
	
	/**
	 * Returns true if the tab strip will be rendered without a background.
	 * @return the plain state
	 */
	boolean isPlain();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes the tab item. Fires the <i>BeforeRemove</i> event before removing, then fires the <i>Remove</i> event after the widget has been removed.
	 * @param item the item to be removed
	 */
	boolean remove( TabItem item );
	
	boolean removeAll();
	
	/**
	 * Scrolls to a particular tab if tab scrolling is enabled.
	 * @param item the item to scroll to
	 * @param animate true to animate the scroll
	 */
	void scrollToTab( TabItem item, boolean animate );
	
	/**
	 * True to animate tab scrolling so that hidden tabs slide smoothly into view (defaults to true). Only applies when {@link #tabScroll} = true.
	 * @param animScroll the anim scroll state
	 */
	void setAnimScroll( boolean animScroll );
	
	void setAutoHeight( boolean autoHeight );
	
	/**
	 * True to have the first item selected when the panel is displayed for the first time if there is not selection (defaults to true).
	 * @param autoSelect the auto select state
	 */
	void setAutoSelect( boolean autoSelect );
	
	/**
	 * True to display an interior border on the body element of the panel, false to hide it (defaults to true, pre-render).
	 * @param bodyBorder the body border style
	 */
	void setBodyBorder( boolean bodyBorder );
	
	/**
	 * True to display a border around the tabs (defaults to true).
	 * @param border true for borders
	 */
	void setBorderStyle( boolean border );
	
	/**
	 * True to show the close context menu (defaults to false).
	 * @param closeMenu true to show it
	 */
	void setCloseContextMenu( boolean closeMenu );
	
	/**
	 * True to render each child tab item when it accessed, false to render all (defaults to true). Setting to false would be useful when using forms as validation would need to be applied to all children even if they had not been selected.
	 * @param deferredRender true to defer rendering
	 */
	void setDeferredRender( boolean deferredRender );
	
	/**
	 * Sets the tab panel messages.
	 * @param messages the messages
	 */
	void setMessages( TabPanelMessages messages );
	
	/**
	 * The minimum width in pixels for each tab when {@link #resizeTabs} = true (defaults to 30).
	 * @param minTabWidth the minimum tab width
	 */
	void setMinTabWidth( int minTabWidth );
	
	/**
	 * True to render the tab strip without a background container image (defaults to false, pre-render).
	 * @param plain
	 */
	void setPlain( boolean plain );
	
	/**
	 * True to automatically resize each tab so that the tabs will completely fill the tab strip (defaults to false). Setting this to true may cause specific widths that might be set per tab to be overridden in order to fit them all into view
	 * (although {@link #minTabWidth} will always be honored).
	 * @param resizeTabs true to enable tab resizing
	 */
	void setResizeTabs( boolean resizeTabs );
	
	/**
	 * Sets the number of milliseconds that each scroll animation should last (defaults to 150).
	 * @param scrollDuration the scroll duration
	 */
	void setScrollDuration( int scrollDuration );
	
	/**
	 * Sets the number of pixels to scroll each time a tab scroll button is pressed (defaults to 100, or if {@link #setResizeTabs(boolean)} = true, the calculated tab width). Only applies when {@link #setTabScroll(boolean)} = true.
	 * @param scrollIncrement the scroll increment
	 */
	void setScrollIncrement( int scrollIncrement );
	
	/**
	 * Sets the selected tab item. Fires the <i>BeforeSelect</i> event before selecting, then fires the <i>Select</i> event after the widget has been selected.
	 * @param item the item to be selected
	 */
	void setSelection( TabItem item );
	
	/**
	 * The number of pixels of space to calculate into the sizing and scrolling of tabs (defaults to 2).
	 * @param tabMargin the tab margin
	 */
	void setTabMargin( int tabMargin );
	
	/**
	 * Sets the position where the tab strip should be rendered (defaults to TOP, pre-render). The only other supported value is BOTTOM. Note that tab scrolling is only supported for position TOP.
	 * @param tabPosition the tab position
	 */
	void setTabPosition( TabPosition tabPosition );
	
	/**
	 * True to enable scrolling to tabs that may be invisible due to overflowing the overall TabPanel width. Only available with tabs on top. (defaults to false).
	 * @param tabScroll true to enable tab scrolling
	 */
	void setTabScroll( boolean tabScroll );
	
	/**
	 * Sets the initial width in pixels of each new tab (defaults to 120).
	 * @param tabWidth
	 */
	void setTabWidth( int tabWidth );
	
}
