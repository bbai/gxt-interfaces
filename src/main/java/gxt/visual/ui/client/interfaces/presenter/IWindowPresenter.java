package gxt.visual.ui.client.interfaces.presenter;

import gxt.visual.ui.client.interfaces.IButton;

/**
 * @author eugenp
 */
public interface IWindowPresenter extends IContentPanelPresenter{

	// added
	void hide( final IButton buttonPressed );
	
}
