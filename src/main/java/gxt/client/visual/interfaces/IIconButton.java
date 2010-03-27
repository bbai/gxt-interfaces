package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.IconButton;

import gxt.client.visual.interfaces.presenter.IIconButtonPresenter;
import gxt.client.visual.interfaces.view.IIconButtonView;

/**
 * @author eugenp
 */
public interface IIconButton extends IBoxComponent, IIconButtonPresenter, IIconButtonView{
	
	/** mine */
	IconButton getComponent();

}
