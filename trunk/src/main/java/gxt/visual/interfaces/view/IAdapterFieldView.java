package gxt.visual.interfaces.view;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IAdapterFieldView extends IFieldView< Object >{
	
	Element getElement();
	
	/**
	 * Returns the wrapped widget.
	 * @return the widget
	 */
	Widget getWidget();
	
	boolean isAttached();
	
	/**
	 * Returns true if the wrapped widget is being resized.
	 * @return true is resizing is enabled
	 */
	boolean isResizeWidget();
	
	boolean isValid( boolean silent );
	
	void onBrowserEvent( Event event );
	
	/**
	 * True to resize the wrapped widget when the field is resized (defaults to false).
	 * @param resizeWidget true to resize the wrapped widget
	 */
	void setResizeWidget( boolean resizeWidget );
	
	boolean validate( boolean preventMark );
	
}
