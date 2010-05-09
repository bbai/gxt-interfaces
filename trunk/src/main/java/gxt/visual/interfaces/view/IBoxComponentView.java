package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.util.Point;
import com.extjs.gxt.ui.client.util.Rectangle;
import com.extjs.gxt.ui.client.util.Size;
import com.extjs.gxt.ui.client.widget.Layer.ShadowPosition;

/**
 * @author eugenp
 */
public interface IBoxComponentView extends IComponentView{
	
	/**
	 * Gets the current box measurements of the component's underlying element. The component must be attached to return page coordinates.
	 * @param local if true the element's left and top are returned instead of page coordinates
	 * @return the component's bounds
	 */
	Rectangle getBounds( boolean local );
	
	/**
	 * Returns the component's offset height.
	 * @return the height
	 */
	int getHeight();
	
	/**
	 * Return the component's height.
	 * @param content true to get the height minus borders and padding
	 * @return the height
	 */
	int getHeight( boolean content );
	
	/**
	 * Returns the component's current position. The component must be attached to return page coordinates.
	 * @param local true to return the element's left and top rather than page coordinates
	 * @return the position
	 */
	Point getPosition( boolean local );
	
	/**
	 * Returns true if the shadow is enabled.
	 * @return the shadow the shadow state
	 */
	boolean getShadow();
	
	/**
	 * Returns the shadow position.
	 * @return the shadow position
	 */
	ShadowPosition getShadowPosition();
	
	/**
	 * Returns the shadow offset.
	 * @return the shadow offset
	 */
	int getShadowOffset();
	
	/**
	 * Returns the component's size.
	 * @return the size
	 */
	Size getSize();
	
	/**
	 * Returns the component's width.
	 * @return the width
	 */
	int getWidth();
	
	/**
	 * Returns the component's width.
	 * @param content true to get width minus borders and padding
	 * @return the width
	 */
	int getWidth( boolean content );
	
	/**
	 * @return the autoHeight
	 */
	boolean isAutoHeight();
	
	/**
	 * @return the autoWidth
	 */
	boolean isAutoWidth();
	
	/**
	 * Returns true if the height is being deferred
	 * @return the defer height state
	 */
	boolean isDeferHeight();
	
	/**
	 * Returns true if shimming is enabled.
	 * @return the shim state
	 */
	boolean isShim();
	
	/**
	 * Sets the component's auto height value (defaults to false).
	 * @param autoHeight true to enable auto height
	 */
	void setAutoHeight( boolean autoHeight );
	
	/**
	 * True to use width:'auto', false to use fixed width (defaults to false).
	 * @param autoWidth the auto width state
	 */
	void setAutoWidth( boolean autoWidth );
	
	/**
	 * Sets the component's size. This method fires the <i>Move</i> and <i>Resize</i> events. element.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param width the width
	 * @param height the height
	 */
	void setBounds( int x, int y, int width, int height );
	
	/**
	 * Sets the component's size. This method fires the <i>Move</i> and <i>Resize</i> events. element.
	 * @param bounds the update box
	 */
	void setBounds( Rectangle bounds );
	
	/**
	 * True to defer height calculations to an external component, false to allow this component to set its own height (defaults to false).
	 * @param deferHeight true to defer height
	 */
	void setDeferHeight( boolean deferHeight );
	
	/**
	 * Sets the component's height. This method fires the <i>Resize</i> event. element.
	 * @param height the new height
	 */
	void setHeight( int height );
	
	/**
	 * Sets the height of the component. This method fires the <i>Resize</i> event. element.
	 * @param height the new height to set
	 */
	void setHeight( String height );
	
	/**
	 * Sets the page XY position of the component. To set the left and top instead, use {@link #setPosition}. This method fires the <i>Move</i> event.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	void setPagePosition( int x, int y );
	
	/**
	 * Sets the page XY position of the component. To set the left and top instead, use {@link #setPosition}. This method fires the <i>Move</i> event.
	 * @param point the new location
	 */
	void setPagePosition( Point point );
	
	/**
	 * Sets the width and height of the component. This method fires the resize event.
	 * @param width the new width to set
	 * @param height the new height to set
	 */
	void setPixelSize( int width, int height );
	
	/**
	 * Sets the left and top of the component. To set the page XY position instead, use {@link #setPagePosition}. This method fires the move event.
	 * @param left the new left
	 * @param top the new top
	 */
	void setPosition( int left, int top );
	
	/**
	 * True to enable a shadow that will be displayed behind the component (defaults to false).
	 * @param shadow true to enable the shadow
	 */
	void setShadow( boolean shadow );
	
	/**
	 * Sets the shadow position (defaults to SIDES).
	 * @param shadowPosition the position
	 */
	void setShadowPosition( ShadowPosition shadowPosition );
	
	/**
	 * Sets the shadow offset (defaults to 4).
	 * @param shadowOffset the offset
	 */
	void setShadowOffset( int shadowOffset );
	
	/**
	 * True to enable a shim which uses a transparent iframe to stop content from bleeding through.
	 * @param shim true to enable a shim
	 */
	void setShim( boolean shim );
	
	/**
	 * Sets the width and height of the component. This method fires the <i>Resize</i> event.
	 * @param width the new width to set
	 * @param height the new height to set
	 */
	void setSize( int width, int height );
	
	/**
	 * Sets the width and height of the component. This method fires the <i>Resize</i> event.
	 * @param width the new width to set
	 * @param height the new height to set
	 */
	void setSize( String width, String height );
	
	/**
	 * Sets the width of the component. This method fires the <i>Resize</i> event.
	 * @param width the new width to set
	 */
	void setWidth( int width );
	
	/**
	 * Sets the width of the component. This method fires the <i>Resize</i> event.
	 * @param width the new width to set
	 */
	void setWidth( String width );
	
	/**
	 * Syncs the layer of the component.
	 */
	void sync( boolean show );
	
	/**
	 * Clears the size cache and resets to the last known size.
	 */
	void syncSize();

}
