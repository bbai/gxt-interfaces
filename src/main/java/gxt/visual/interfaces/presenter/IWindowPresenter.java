package gxt.visual.interfaces.presenter;

import gxt.visual.interfaces.IButton;

/**
 * @author eugenp
 */
public interface IWindowPresenter extends IContentPanelPresenter{

	// added
	void hide( final IButton buttonPressed );
	
}
