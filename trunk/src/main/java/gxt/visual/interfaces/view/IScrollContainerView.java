package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.ScrollListener;
import com.extjs.gxt.ui.client.widget.Component;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IScrollContainerView< T extends Component > extends IContainerView< T >{
	
	/**
	 * Adds a listener to receive scroll events.
	 * @param listener the listener to be added
	 */
	void addScrollListener( ScrollListener listener );
	
	/**
	 * Returns the horizontal scroll position.
	 * @return the horizontal scroll position
	 */
	int getHScrollPosition();
	
	/**
	 * Returns the scroll model.
	 * @return the scroll mode
	 */
	Scroll getScrollMode();
	
	/**
	 * Returns the vertical scroll position.
	 * @return the vertical scroll position
	 */
	int getVScrollPosition();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a previously added listener.
	 * @param listener the listener to be removed
	 */
	void removeScrollListener( ScrollListener listener );
	
	/**
	 * Scroll the child into view.
	 * @param child the child widget
	 */
	void scrollIntoView( Widget child );
	
	/**
	 * Sets the horizontal scroll position.
	 * @param position the new horizontal scroll position
	 */
	void setHScrollPosition( int position );
	
	/**
	 * Sets the container's scroll mode.
	 * @param scroll the scroll mode
	 */
	void setScrollMode( Scroll scroll );
	
	/**
	 * Sets the vertical scroll position.
	 * @param position the new horizontal scroll position, in pixels
	 */
	void setVScrollPosition( int position );

}
