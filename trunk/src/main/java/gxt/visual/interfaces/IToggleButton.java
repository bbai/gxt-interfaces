package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IToggleButtonPresenter;
import gxt.visual.interfaces.view.IToggleButtonView;

import com.extjs.gxt.ui.client.widget.button.ToggleButton;

/**
 * @author eugenp
 */
public interface IToggleButton extends IButton, IToggleButtonView, IToggleButtonPresenter{
	
	/** mine */
	ToggleButton getComponent();

}
