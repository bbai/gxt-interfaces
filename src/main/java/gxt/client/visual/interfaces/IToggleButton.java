package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IToggleButtonPresenter;
import gxt.client.visual.interfaces.view.IToggleButtonView;

import com.extjs.gxt.ui.client.widget.button.ToggleButton;

/**
 * @author eugenp
 */
public interface IToggleButton extends IButton, IToggleButtonView, IToggleButtonPresenter{
	
	/** mine */
	ToggleButton getComponent();

}
