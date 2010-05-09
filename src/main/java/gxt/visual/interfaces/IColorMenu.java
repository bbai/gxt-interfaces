package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.ColorMenu;

import gxt.visual.interfaces.presenter.IColorMenuPresenter;
import gxt.visual.interfaces.view.IColorMenuView;

/**
 * @author eugenp
 */
public interface IColorMenu extends IMenu, IColorMenuView, IColorMenuPresenter{
	
	/** mine */
	ColorMenu getComponent();

}
