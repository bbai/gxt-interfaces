package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IButtonPresenter;
import gxt.visual.interfaces.view.IButtonView;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * @author eugenp
 */
public interface IButton extends IBoxComponent, IconSupport, IButtonView, IButtonPresenter{
	
	/** mine */
	Button getComponent();

}
