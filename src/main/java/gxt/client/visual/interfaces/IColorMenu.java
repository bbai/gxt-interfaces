package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.ColorMenu;
import gxt.client.visual.interfaces.presenter.IColorMenuPresenter;
import gxt.client.visual.interfaces.view.IColorMenuView;

/**
 * @author eugenp
 */
public interface IColorMenu extends IMenu, IColorMenuView, IColorMenuPresenter{
	
	/** mine */
	ColorMenu getComponent();

}
