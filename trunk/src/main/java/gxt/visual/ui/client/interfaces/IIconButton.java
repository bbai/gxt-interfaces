package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.button.IconButton;

import gxt.visual.ui.client.interfaces.presenter.IIconButtonPresenter;
import gxt.visual.ui.client.interfaces.view.IIconButtonView;

/**
 * @author eugenp
 */
public interface IIconButton extends IBoxComponent, IIconButtonPresenter, IIconButtonView{
	
	/** mine */
	IconButton getComponent();

}
