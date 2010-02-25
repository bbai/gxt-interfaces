package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.event.KeyListener;

/**
 * @author eugenp
 */
public interface ITriggerField< D > extends ITextField< D >{
	
	void setEditable( final boolean editable );
	
	void setTriggerStyle( String triggerStyle );
	
	void addKeyListener( KeyListener keyListener );
	
}
