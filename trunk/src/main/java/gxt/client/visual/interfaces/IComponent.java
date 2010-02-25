package gxt.client.visual.interfaces;


import gxt.client.visual.IEnableDisable;
import gxt.client.visual.IListen;
import gxt.client.visual.IVisible;

import java.util.List;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.Observable;
import com.extjs.gxt.ui.client.widget.Component;
import com.google.gwt.user.client.Element;

/**
 * @author eugenp
 */
public interface IComponent extends IEnableDisable, IVisible, IListen, Observable, IWidget{
	
	List< Listener< ? extends BaseEvent >> getListeners( final EventType eventType );
	
	void setId( final String id );
	String getId();
	
	Element getElement();
	boolean isRendered();
	
	boolean isEnabled();
	void setEnabled( final boolean enabled );
	
	void setBorders( final boolean show );
	void setToolTip( final String text );
	boolean fireEvent( final EventType type );
	
	void hide();
	void show();
	
	boolean fireEvent( final EventType type, final ComponentEvent ce );
	void setStyleAttribute( final String attr, final String value );
	
	// mine
	Component getComponent();

}
