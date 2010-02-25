package gxt.client.visual;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Listener;

/**
 * @author eugenp
 */
public interface IListen{
	
	void addListener( EventType eventType, Listener< ? extends BaseEvent > listener );
	
}
