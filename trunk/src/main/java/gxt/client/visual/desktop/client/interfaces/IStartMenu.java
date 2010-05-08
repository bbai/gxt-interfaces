package gxt.client.visual.desktop.client.interfaces;

import com.extjs.gxt.desktop.client.StartMenu;

import gxt.client.visual.desktop.client.interfaces.presenter.IStartMenuPresenter;
import gxt.client.visual.desktop.client.interfaces.view.IStartMenuView;
import gxt.client.visual.interfaces.IMenu;

/**
 * @author eugenp
 */
public interface IStartMenu extends IMenu, IStartMenuView, IStartMenuPresenter{
	
	/** mine */
	StartMenu getComponent();

}
