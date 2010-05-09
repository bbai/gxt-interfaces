package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.SplitButton;

import gxt.visual.interfaces.presenter.ISplitButtonPresenter;
import gxt.visual.interfaces.view.ISplitButtonView;

/**
 * @author eugenp
 */
public interface ISplitButton extends IButton, ISplitButtonView, ISplitButtonPresenter{
	
	/** mine */
	SplitButton getComponent();

}
