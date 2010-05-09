package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IToggleButtonPresenter;
import gxt.visual.ui.client.interfaces.view.IToggleButtonView;

import com.extjs.gxt.ui.client.widget.button.ToggleButton;

/**
 * @author eugenp
 */
public interface IToggleButton extends IButton, IToggleButtonView, IToggleButtonPresenter{
	
	/** mine */
	ToggleButton getComponent();

}
