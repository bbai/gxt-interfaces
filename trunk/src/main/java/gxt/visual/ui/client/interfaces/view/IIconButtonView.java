package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.IconButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;

/**
 * @author eugenp
 */
public interface IIconButtonView extends IBoxComponentView{
	
	/**
	 * @param listener
	 */
	void addSelectionListener( SelectionListener< IconButtonEvent > listener );
	
	/**
	 * Changes the icon style.
	 * @param style the new icon style
	 */
	void changeStyle( String style );
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Removes a previously added listener.
	 * @param listener the listener to be removed
	 */
	void removeSelectionListener( SelectionListener< ButtonEvent > listener );
	
}
