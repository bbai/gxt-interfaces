package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.fx.Draggable;
import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface ISplitBarView extends IBoxComponentView{
	
	/**
	 * Returns the bar width.
	 * @return the bar width
	 */
	int getBarWidth();
	
	/**
	 * Returns the split bar's draggable instance.
	 * @return the draggable instance
	 */
	Draggable getDraggable();
	
	/**
	 * Returns the handle width.
	 * @return the handle width
	 */
	int getHandleWidth();
	
	/**
	 * Returns the maximum size.
	 * @return the max size
	 */
	int getMaxSize();
	
	/**
	 * @return the minSize
	 */
	int getMinSize();
	
	/**
	 * Returns the resize widget.
	 * @return the resize widget
	 */
	Component getResizeWidget();
	
	/**
	 * Returns the x offset.
	 * @return the xOffset the x offset value
	 */
	int getXOffset();
	
	/**
	 * Returns the y offset.
	 * @return the y offset
	 */
	int getYOffset();
	
	/**
	 * Returns the auto size state.
	 * @return true if auto size is enabled
	 */
	boolean isAutoSize();
	
	/**
	 * Removes the split bar from the resize widget.
	 */
	void release();
	
	/**
	 * True to update the size of the the resize widget after a drag operation using a proxy (defaults to true).
	 * @param autoSize the auto size state
	 */
	void setAutoSize( boolean autoSize );
	
	/**
	 * Sets the width of drag proxy during resizing (defaults to 2).
	 * @param barWidth the bar width
	 */
	void setBarWidth( int barWidth );
	
	/**
	 * Sets the width of the drag handles (defaults to 5).
	 * @param handleWidth the handle width
	 */
	void setHandleWidth( int handleWidth );
	
	/**
	 * Sets the maximum size of the resize widget (defaults to 2000).
	 * @param maxSize the maximum size
	 */
	void setMaxSize( int maxSize );
	
	/**
	 * Sets he minimum size of the resize widget (defaults to 10).
	 * @param minSize the minimum size
	 */
	void setMinSize( int minSize );
	
	/**
	 * The amount of pixels the bar should be offset to the left (defaults to 0).
	 * @param xOffset the xOffset to set
	 */
	void setXOffset( int xOffset );
	
	/**
	 * Sets the amount of pixels the bar should be offset to the top (defaults to 0).
	 * @param yOffset the yOffset to set
	 */
	void setYOffset( int yOffset );
	
	void sync();
	
}
