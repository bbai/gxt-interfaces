package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.button.IconButton;

import gxt.visual.interfaces.presenter.IIconButtonPresenter;
import gxt.visual.interfaces.view.IIconButtonView;

/**
 * @author eugenp
 */
public interface IIconButton extends IBoxComponent, IIconButtonPresenter, IIconButtonView{
	
	/** mine */
	IconButton getComponent();

}
