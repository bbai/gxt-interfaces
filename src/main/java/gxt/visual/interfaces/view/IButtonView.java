package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.Style.ButtonArrowAlign;
import com.extjs.gxt.ui.client.Style.ButtonScale;
import com.extjs.gxt.ui.client.Style.IconAlign;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

/**
 * @author eugenp
 */
public interface IButtonView extends IBoxComponentView{
	
	/**
	 * Adds a selection listener.
	 * @param listener the listener to add
	 */
	void addSelectionListener( SelectionListener< ButtonEvent > listener );
	// presenter candidate
	
	/**
	 * Returns the button's arrow alignment.
	 * @return the arrow alignment
	 */
	ButtonArrowAlign getArrowAlign();

	/**
	 * Returns the button's menu (if it has one).
	 * @return the menu
	 */
	Menu getMenu();
	
	/**
	 * Returns the button's menu alignment.
	 * @return the menu alignment
	 */
	String getMenuAlign();
	
	/**
	 * Returns the button's minimum width.
	 * @return the minWidth the minimum width
	 */
	int getMinWidth();
	
	/**
	 * Returns true if mouse over effect is disabled.
	 * @return the handleMouseEvents the handle mouse event state
	 */
	boolean getMouseEvents();
	// presenter candidate
	
	/**
	 * Returns the buttons scale.
	 * @return the scale
	 */
	ButtonScale getScale();
	
	/**
	 * Returns the button's text.
	 * @return the button text
	 */
	String getText();
	
	/**
	 * @return the type
	 */
	String getType();
	
	/**
	 * Hide this button's menu (if it has one).
	 */
	void hideMenu();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a previously added listener.
	 * @param listener the listener to be removed
	 */
	void removeSelectionListener( SelectionListener< ButtonEvent > listener );
	// presenter candidate
	
	/**
	 * Sets the arrow alignment (defaults to RIGHT).
	 * @param arrowAlign the arrow alignment
	 */
	void setArrowAlign( ButtonArrowAlign arrowAlign );
	
	/**
	 * Sets the button's icon style. The style name should match a CSS style that specifies a background image using the following format:
	 * 
	 * <pre>
	 * 
	 * &lt;code&gt; .my-icon { background: url(images/icons/my-icon.png) no-repeat
	 * center left !important; } &lt;/code&gt;
	 * 
	 * </pre>
	 * @param icon the icon
	 */
	void setIcon( AbstractImagePrototype icon );
	
	/**
	 * Sets the icon alignment (defaults to LEFT).
	 * @param iconAlign the icon alignment
	 */
	void setIconAlign( IconAlign iconAlign );

	/**
	 * Sets the button's menu.
	 * @param menu the menu
	 */
	void setMenu( Menu menu );
	
	/**
	 * Sets the position to align the menu to, see {@link El#alignTo} for more details (defaults to 'tl-bl?', pre-render).
	 * @param menuAlign the menu alignment
	 */
	void setMenuAlign( String menuAlign );
	
	/**
	 * Sets he minimum width for this button (used to give a set of buttons a common width)
	 * @param minWidth the minimum width
	 */
	void setMinWidth( int minWidth );
	
	/**
	 * False to disable visual cues on mouseover, mouseout and mousedown (defaults to true).
	 * @param handleMouseEvents false to disable mouse over changes
	 */
	void setMouseEvents( boolean handleMouseEvents );
	// presenter candidate
	
	/**
	 * Sets the button scale.
	 * @param scale the scale to set
	 */
	void setScale( ButtonScale scale );
	
	/**
	 * Sets the button's tab index.
	 * @param index the tab index
	 */
	void setTabIndex( int index );
	// presenter candidate
	
	/**
	 * Sets the button's text.
	 * @param text the new text
	 */
	void setText( String text );
	
	/**
	 * Submit, reset or button (defaults to 'button').
	 * @param type the new type
	 */
	void setType( String type );
	
	/**
	 * Show this button's menu (if it has one).
	 */
	void showMenu();
	
}
