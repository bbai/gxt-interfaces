package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.button.ToolButton;

import gxt.visual.ui.client.interfaces.presenter.IToolButtonPresenter;
import gxt.visual.ui.client.interfaces.view.IToolButtonView;

/**
 * @author eugenp
 */
public interface IToolButton extends IIconButton, IToolButtonView, IToolButtonPresenter{
	
	/** mine */
	ToolButton getComponent();

}
