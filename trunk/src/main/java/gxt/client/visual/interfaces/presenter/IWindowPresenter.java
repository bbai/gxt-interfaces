package gxt.client.visual.interfaces.presenter;

import gxt.client.visual.interfaces.IButton;

/**
 * @author eugenp
 */
public interface IWindowPresenter extends IContentPanelPresenter{

	// added
	void hide( final IButton buttonPressed );
	
}
