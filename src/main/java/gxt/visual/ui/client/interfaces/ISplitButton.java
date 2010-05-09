package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.button.SplitButton;

import gxt.visual.ui.client.interfaces.presenter.ISplitButtonPresenter;
import gxt.visual.ui.client.interfaces.view.ISplitButtonView;

/**
 * @author eugenp
 */
public interface ISplitButton extends IButton, ISplitButtonView, ISplitButtonPresenter{
	
	/** mine */
	SplitButton getComponent();

}
