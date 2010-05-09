package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.CheckMenuItem;

import gxt.visual.ui.client.interfaces.presenter.ICheckMenuItemPresenter;
import gxt.visual.ui.client.interfaces.view.ICheckMenuItemView;

/**
 * @author eugenp
 */
public interface ICheckMenuItem extends IMenuItem, ICheckMenuItemView, ICheckMenuItemPresenter{
	
	/** mine */
	CheckMenuItem getComponent();

}
