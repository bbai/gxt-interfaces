package gxt.client.visual.interfaces;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IWidget extends EventListener, HasHandlers{
	
	public void sinkEvents( int eventBitsToAdd );
	
	public void setLayoutData( Object layoutData );
	
	public void removeFromParent();
	
	public void onBrowserEvent( Event event );
	
	public boolean isAttached();
	
	public Widget getParent();
	
	public Object getLayoutData();
	
	public void fireEvent( GwtEvent< ? > event );

}
