package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.CheckMenuItem;
import gxt.client.visual.interfaces.presenter.ICheckMenuItemPresenter;
import gxt.client.visual.interfaces.view.ICheckMenuItemView;

/**
 * @author eugenp
 */
public interface ICheckMenuItem extends IMenuItem, ICheckMenuItemView, ICheckMenuItemPresenter{
	
	/** mine */
	CheckMenuItem getComponent();

}
