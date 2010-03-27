package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IButtonPresenter;
import gxt.client.visual.interfaces.view.IButtonView;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.button.Button;

/**
 * @author eugenp
 */
public interface IButton extends IBoxComponent, IconSupport, IButtonView, IButtonPresenter{
	
	/** mine */
	Button getComponent();

}
