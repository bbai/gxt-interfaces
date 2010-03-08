package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.event.WindowListener;
import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * @author eugenp
 */
public interface IWindow extends IContentPanel{
	
	// added
	void hide( final IButton buttonPressed );
	
	// gxt
	void hide( final Button buttonPressed );
	
	void setAutoHide( final boolean autoHide );
	
	void addWindowListener( final WindowListener listener );
	
	void removeWindowListener( final WindowListener listener );
	
	void setClosable( final boolean closable );
	
}
