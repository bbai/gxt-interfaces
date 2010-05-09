package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.DateMenu;

import gxt.visual.ui.client.interfaces.presenter.IDateMenuPresenter;
import gxt.visual.ui.client.interfaces.view.IDateMenuView;

/**
 * @author eugenp
 */
public interface IDateMenu extends IMenu, IDateMenuPresenter, IDateMenuView{
	
	/** mine */
	DateMenu getComponent();

}
