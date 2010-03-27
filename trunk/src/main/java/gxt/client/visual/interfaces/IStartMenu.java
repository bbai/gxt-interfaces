package gxt.client.visual.interfaces;

import com.extjs.gxt.desktop.client.StartMenu;
import gxt.client.visual.interfaces.presenter.IStartMenuPresenter;
import gxt.client.visual.interfaces.view.IStartMenuView;

/**
 * @author eugenp
 */
public interface IStartMenu extends IMenu, IStartMenuView, IStartMenuPresenter{
	
	/** mine */
	StartMenu getComponent();

}
