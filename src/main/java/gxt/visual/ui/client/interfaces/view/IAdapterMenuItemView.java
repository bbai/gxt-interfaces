package gxt.visual.ui.client.interfaces.view;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IAdapterMenuItemView extends IItemView{
	
	Element getElement();
	
	/**
	 * Returns the wrapped widget.
	 * @return the widget
	 */
	Widget getWidget();
	
	boolean isAttached();
	
	/**
	 * Returns true if the component can be activated.
	 * @return true if can be activated
	 */
	boolean isCanActivate();
	
	boolean isNeedsIndent();
	
	void onBrowserEvent( Event event );
	
	/**
	 * Sets whether the item can be activated.
	 * @param canActivate true to activate
	 */
	void setCanActivate( boolean canActivate );
	
	void setNeedsIndent( boolean needsIndent );
	
}
