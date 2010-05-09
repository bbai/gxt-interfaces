package gxt.visual.ui.client.interfaces;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IWidget extends EventListener, HasHandlers{
	
	void sinkEvents( int eventBitsToAdd );
	
	void setLayoutData( Object layoutData );
	
	void removeFromParent();
	
	void onBrowserEvent( Event event );
	
	boolean isAttached();
	
	Widget getParent();
	
	Object getLayoutData();
	
	void fireEvent( GwtEvent< ? > event );

}
