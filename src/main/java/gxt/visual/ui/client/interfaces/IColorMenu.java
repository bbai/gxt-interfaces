package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.ColorMenu;

import gxt.visual.ui.client.interfaces.presenter.IColorMenuPresenter;
import gxt.visual.ui.client.interfaces.view.IColorMenuView;

/**
 * @author eugenp
 */
public interface IColorMenu extends IMenu, IColorMenuView, IColorMenuPresenter{
	
	/** mine */
	ColorMenu getComponent();

}
