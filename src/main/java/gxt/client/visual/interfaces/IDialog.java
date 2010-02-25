package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * @author eugenp
 */
public interface IDialog extends IWindow{
	
	Button getButtonById( final String string );
	void setHideOnButtonClick( boolean hideOnButtonClick );
	void setButtons( final String buttons );

}
