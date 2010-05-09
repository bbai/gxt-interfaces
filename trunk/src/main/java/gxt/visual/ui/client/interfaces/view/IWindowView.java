package gxt.visual.ui.client.interfaces.view;

import gxt.visual.ui.client.interfaces.IButton;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.WindowListener;
import com.extjs.gxt.ui.client.fx.Draggable;
import com.extjs.gxt.ui.client.fx.Resizable;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IWindowView extends IContentPanelView{
	
	/**
	 * Adds a listener to receive window events.
	 * @param listener the listener
	 */
	void addWindowListener( WindowListener listener );
	
	/**
	 * Aligns the window to the specified element. Should only be called when the window is visible.
	 * @param elem the element to align to.
	 * @param pos the position to align to (see {@link El#alignTo} for more details)
	 * @param offsets the offsets
	 */
	void alignTo( Element elem, String pos, int[] offsets );
	
	/**
	 * Centers the window in the viewport. Should only be called when the window is visible.
	 */
	void center();
	
	@Deprecated
	void close();
	
	@Deprecated
	void close( Button b );
	
	/**
	 * Focus the window. If a focusWidget is set, it will receive focus, otherwise the window itself will receive focus.
	 */
	void focus();
	
	/**
	 * Returns true if the window is constrained.
	 * @return the constrain state
	 */
	boolean getConstrain();
	
	/**
	 * Returns the windows's container element.
	 * @return the container element or null if not specified.
	 */
	Element getContainer();
	
	/**
	 * Returns the window's draggable instance.
	 * @return the draggable instance
	 */
	Draggable getDraggable();
	
	/**
	 * Returns the focus widget.
	 * @return the focus widget
	 */
	Widget getFocusWidget();
	
	/**
	 * Returns the window's initial width.
	 * @return the width
	 */
	int getInitialWidth();
	
	/**
	 * Returns the min height.
	 * @return the min height
	 */
	int getMinHeight();
	
	/**
	 * Returns the min width.
	 * @return the min width
	 */
	int getMinWidth();
	
	/**
	 * Returns the window's resizable instance.
	 * @return the resizable
	 */
	Resizable getResizable();
	
	void hide();
	
	/**
	 * Hides the window.
	 * @param buttonPressed the button that was pressed or null
	 */
	void hide( Button buttonPressed );
	
	/**
	 * Returns true if auto hide is enabled.
	 * @return the auto hide state
	 */
	boolean isAutoHide();
	
	/**
	 * Returns true if modal blinking is enabled.
	 * @return the blink modal state
	 */
	boolean isBlinkModal();
	
	/**
	 * Returns true if the window is closable.
	 * @return the closable state
	 */
	boolean isClosable();
	
	/**
	 * Returns true if the panel is draggable.
	 * @return the draggable state
	 */
	boolean isDraggable();
	
	/**
	 * Returns true if window maximizing is enabled.
	 * @return the maximizable state
	 */
	boolean isMaximizable();
	
	/**
	 * Returns true if the window is maximized.
	 * @return the plain style state
	 */
	boolean isMaximized();
	
	/**
	 * Returns true if window minimizing is enabled.
	 * @return the minimizable state
	 */
	boolean isMinimizable();
	
	/**
	 * Returns true if modal behavior is enabled.
	 * @return the modal state
	 */
	boolean isModal();
	
	/**
	 * Returns true if the window is closed when the esc key is pressed.
	 * @return the on esc state
	 */
	boolean isOnEsc();
	
	/**
	 * Returns true if the plain style is enabled.
	 * @return the plain style state
	 */
	boolean isPlain();
	
	/**
	 * Returns true if window resizing is enabled.
	 * @return the resizable state
	 */
	boolean isResizable();
	
	/**
	 * Fits the window within its current container and automatically replaces the 'maximize' tool button with the 'restore' tool button.
	 */
	void maximize();
	
	/**
	 * Placeholder method for minimizing the window. By default, this method simply fires the minimize event since the behavior of minimizing a window is application-specific. To implement custom minimize behavior, either the minimize event can be
	 * handled or this method can be overridden.
	 */
	void minimize();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a previously added listener.
	 * @param listener the listener to remove
	 */
	void removeWindowListener( WindowListener listener );
	
	/**
	 * Restores a maximized window back to its original size and position prior to being maximized and also replaces the 'restore' tool button with the 'maximize' tool button.
	 */
	void restore();
	
	/**
	 * Makes this the active window by showing its shadow, or deactivates it by hiding its shadow. This method also fires the activate or deactivate event depending on which action occurred.
	 */
	void setActive( boolean active );
	
	/**
	 * True to hide the window when the user clicks outside of the window's bounds (defaults to false, pre-render).
	 * @param autoHide true for auto hide
	 */
	void setAutoHide( boolean autoHide );
	
	/**
	 * True to blink the window when the user clicks outside of the windows bounds (defaults to false). Only applies window model = true.
	 * @param blinkModal true to blink
	 */
	void setBlinkModal( boolean blinkModal );
	
	/**
	 * True to display the 'close' tool button and allow the user to close the window, false to hide the button and disallow closing the window (default to true).
	 * @param closable true to enable closing
	 */
	void setClosable( boolean closable );
	
	/**
	 * True to constrain the window to the {@link Viewport}, false to allow it to fall outside of the Viewport (defaults to true).
	 * @param constrain true to constrain, otherwise false
	 */
	void setConstrain( boolean constrain );
	
	/**
	 * Sets the container elemen to be used to size and position the window when maximized.
	 * @param container the container element
	 */
	void setContainer( Element container );
	
	/**
	 * True to enable dragging of this Panel (defaults to false).
	 * @param draggable the draggable to state
	 */
	void setDraggable( boolean draggable );
	
	/**
	 * Widget to be given focus when the window is focused).
	 * @param focusWidget the focus widget
	 */
	void setFocusWidget( Widget focusWidget );
	
	/**
	 * The width of the window if no width has been specified (defaults to 300).
	 * @param initialWidth the initial width
	 */
	void setInitialWidth( int initialWidth );
	
	/**
	 * True to display the 'maximize' tool button and allow the user to maximize the window, false to hide the button and disallow maximizing the window (defaults to false). Note that when a window is maximized, the tool button will automatically
	 * change to a 'restore' button with the appropriate behavior already built-in that will restore the window to its previous size.
	 * @param maximizable the maximizable state
	 */
	void setMaximizable( boolean maximizable );
	
	/**
	 * The minimum height in pixels allowed for this window (defaults to 100). Only applies when resizable = true.
	 * @param minHeight the min height
	 */
	void setMinHeight( int minHeight );
	
	/**
	 * True to display the 'minimize' tool button and allow the user to minimize the window, false to hide the button and disallow minimizing the window (defaults to false). Note that this button provides no implementation -- the behavior of
	 * minimizing a window is implementation-specific, so the minimize event must be handled and a custom minimize behavior implemented for this option to be useful.
	 * @param minimizable true to enabled minimizing
	 */
	void setMinimizable( boolean minimizable );
	
	/**
	 * The minimum width in pixels allowed for this window (defaults to 200). Only applies when resizable = true.
	 * @param minWidth the minimum height
	 */
	void setMinWidth( int minWidth );
	
	/**
	 * True to make the window modal and mask everything behind it when displayed, false to display it without restricting access to other UI elements (defaults to false).
	 * @param modal true for modal
	 */
	void setModal( boolean modal );
	
	/**
	 * Allows override of the built-in processing for the escape key. Default action is to close the Window.
	 * @param onEsc true to close window on esc key press
	 */
	void setOnEsc( boolean onEsc );
	
	void setPagePosition( int x, int y );
	
	/**
	 * True to render the window body with a transparent background so that it will blend into the framing elements, false to add a lighter background color to visually highlight the body element and separate it more distinctly from the surrounding
	 * frame (defaults to false).
	 * @param plain true to enable the plain style
	 */
	void setPlain( boolean plain );
	
	void setPosition( int left, int top );
	
	/**
	 * True to allow user resizing at each edge and corner of the window, false to disable resizing (defaults to true).
	 * @param resizable true to enabled resizing
	 */
	void setResizable( boolean resizable );
	
	void setZIndex( int zIndex );
	
	/**
	 * Shows the window, rendering it first if necessary, or activates it and brings it to front if hidden.
	 */
	void show();
	
	/**
	 * Sends this window to the back of (lower z-index than) any other visible windows.
	 */
	void toBack();
	
	/**
	 * Brings this window to the front of any other visible windows.
	 */
	void toFront();

	// added
	void hide( final IButton buttonPressed );
	
}
