package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IMenuBarPresenter;
import gxt.visual.ui.client.interfaces.view.IMenuBarView;

import com.extjs.gxt.ui.client.widget.menu.MenuBar;
import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;

/**
 * @author ADaroussin
 */
public interface IMenuBar extends IContainer< MenuBarItem >, IMenuBarView, IMenuBarPresenter{
	/** mine */
	MenuBar getComponent();
}
