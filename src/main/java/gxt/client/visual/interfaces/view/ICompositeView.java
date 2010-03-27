package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.Component;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;

/**
 * @author eugenp
 */
public interface ICompositeView extends IBoxComponentView{
	
	/**
	 * Returns the wrapped component.
	 * @return the component
	 */
	Component getComponent();
	
	Element getElement();
	
	boolean isAttached();
	
	void onBrowserEvent( Event event );
	
	void setSize( int width, int height );
	
	void setSize( String width, String height );
	
}
