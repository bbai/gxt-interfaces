package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.DateMenu;

import gxt.visual.interfaces.presenter.IDateMenuPresenter;
import gxt.visual.interfaces.view.IDateMenuView;

/**
 * @author eugenp
 */
public interface IDateMenu extends IMenu, IDateMenuPresenter, IDateMenuView{
	
	/** mine */
	DateMenu getComponent();

}
