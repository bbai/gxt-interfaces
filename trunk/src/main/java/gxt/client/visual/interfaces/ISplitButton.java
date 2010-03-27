package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.SplitButton;

import gxt.client.visual.interfaces.presenter.ISplitButtonPresenter;
import gxt.client.visual.interfaces.view.ISplitButtonView;

/**
 * @author eugenp
 */
public interface ISplitButton extends IButton, ISplitButtonView, ISplitButtonPresenter{
	
	/** mine */
	SplitButton getComponent();

}
