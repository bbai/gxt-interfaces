package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.Style.IconAlign;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * @author eugenp
 */
public interface IButton extends IBoxComponent, IconSupport{
	
	void addSelectionListener( final SelectionListener< ButtonEvent > listener );
	
	void setText( final String text );
	
	void setMenu( final Menu menu );
	
	void setIconAlign( final IconAlign iconAlign );
	
	// mine
	Button getComponent();

}
