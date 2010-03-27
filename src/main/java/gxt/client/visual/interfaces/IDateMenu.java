package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.DateMenu;
import gxt.client.visual.interfaces.presenter.IDateMenuPresenter;
import gxt.client.visual.interfaces.view.IDateMenuView;

/**
 * @author eugenp
 */
public interface IDateMenu extends IMenu, IDateMenuPresenter, IDateMenuView{
	
	/** mine */
	DateMenu getComponent();

}
