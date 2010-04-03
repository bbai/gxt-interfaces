package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.ToolButton;

import gxt.client.visual.interfaces.presenter.IToolButtonPresenter;
import gxt.client.visual.interfaces.view.IToolButtonView;

/**
 * @author eugenp
 */
public interface IToolButton extends IIconButton, IToolButtonView, IToolButtonPresenter{
	
	/** mine */
	ToolButton getComponent();

}
